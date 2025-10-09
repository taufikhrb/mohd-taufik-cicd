import { test, expect } from '@playwright/test';

test('open multiple contexts and pages in same test', async ({ browser, page, context }) => {
  // First context and page (fixture)
  await page.goto('https://www.flipkart.com/');
  await page.locator("//input[@class='Pke_EE']").fill('iphone 14');
  await page.keyboard.press('Enter');
  console.log(' First context searching done.');

  // Second independent context
  const newContext = await browser.newContext();
  const newPage = await newContext.newPage();

  await newPage.goto('https://www.amazon.in/');
  await newPage.locator('#twotabsearchtextbox').fill('iphone 14');
  await newPage.keyboard.press('Enter');
  console.log(' Second context searching done.');

  // Optional: extract something from both pages
  const flipkartTitle = await page.title();
  const amazonTitle = await newPage.title();

  console.log('🛒 Flipkart title:', flipkartTitle);
  console.log('🛍️ Amazon title:', amazonTitle);

  // Close second context
  await newContext.close();
});

import { test, chromium, expect } from '@playwright/test';

test('homepage has Flipkart title', async ({browser}) => {

  //const browser=await chromium.launch()
  const context=await browser.newContext()
  const page=await context.newPage();

  await page.goto("https://www.flipkart.com/");
  //await expect(page.title()).toEqual("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")
  await page.locator("//input[@class='Pke_EE']").fill("iphone 14");
  await page.keyboard.press('Enter');
  await page.locator("(//div[@class='KzDlHZ'])[1]").click();
  await page.waitForTimeout(5000);

  const pagess=page.context().pages();
  const phonePage=pagess[pagess.length-1];

  await phonePage.bringToFront();
  const price=await phonePage.locator("//div[@class='Nx9bqj CxhGGd']").textContent();

  console.log("The price of the phone is",price)

});

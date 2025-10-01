import { chromium, test } from "@playwright/test";




test.only("Automating the resman application", async () => {
    const browser = await chromium.launch()
    const context = await browser.newContext();
    const page = await context.newPage()


    await page.goto("http://regression.myresman.com/");
    await page.getByPlaceholder("Username").fill("reg123");
    await page.getByPlaceholder("Password").fill("reg12345");
    await page.locator("//button[@type='submit']").click();
    await page.waitForLoadState("load");
    await page.waitForTimeout(10000);


})


import { chromium, test ,request} from "@playwright/test";

test("Login to application", async () => {
    const browser = await chromium.launch();
    const context = await browser.newContext();
    const page = await context.newPage();

    await page.goto("http://regression.myresman.com/");
    await page.getByPlaceholder("Username").fill("reg123");
    await page.getByPlaceholder("Password").fill("reg12345");
    await page.locator("//button[@type='submit']").click();
    await page.waitForLoadState("load");
    await page.waitForTimeout(10000);
    await page.locator("#CloseAdvisor").click();
    await page.waitForLoadState("load");
    await page.waitForTimeout(5000);
    
    // Optionally, add an assertion to verify login success
    // Example: await expect(page).toHaveURL(/dashboard|home/);

    await page.close();
    await browser.close();
});

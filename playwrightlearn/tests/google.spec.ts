import { chromium, test } from "@playwright/test";




test("Automating the resman application", async () => {
    const browser = await chromium.launch()
    const context = await browser.newContext();
    const page = await context.newPage()


    await page.goto("http://regression.myresman.com/");
    await page.getByPlaceholder("Username").fill("reg123");
    await page.getByPlaceholder("Password").fill("reg12345");
    await page.locator("//button[@type='submit']").click();
    await page.waitForLoadState("load");
    await page.waitForTimeout(10000);
    // Attempt to close common popups before closing the page
    try {
        // Example: close button with text 'Close'
        if (await page.locator('text=Close').isVisible()) {
            await page.locator('text=Close').click();
        }
        // Example: close icon (X)
        if (await page.locator('button:has-text("×")').isVisible()) {
            await page.locator('button:has-text("×")').click();
        }
        // Example: dialog close icon
        if (await page.locator('[aria-label="Close"]').isVisible()) {
            await page.locator('[aria-label="Close"]').click();
        }
    } catch (e) {
        // Ignore errors if no popup is present
    }
    await page.close();
    await browser.close();
})


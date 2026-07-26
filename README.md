# Web App APK Deploy

Android WebView wrappers for web apps, built automatically with GitHub Actions.

## How it works

Each app is an Android project with a `WebView` that loads a URL and provides native features — JavaScript, file uploads, camera access, downloads, push notifications, and more.

When you push to `main`, GitHub Actions builds the APK automatically. Download it from the **Actions** tab → click the latest run → **Artifacts**.

## Current apps

| App | URL | APK download |
|-----|-----|-------------|
| TouchBase | https://securepay-dashboard.pages.dev | `TouchBase-debug` artifact |

## Adding a new app

1. Copy the `app/` folder to a new module or create a new project folder
2. Update `MainActivity.java`:
   - Change `APP_URL` to your target URL
   - Adjust `setInitialScale()` if needed
3. Update `strings.xml`, `colors.xml`, icon files
4. Update `app/build.gradle.kts` (applicationId, app name, etc.)
5. Push — the workflow builds all modules automatically

## Features baked in

- Full JavaScript, DOM storage, geolocation, cookies
- Desktop user agent (loads desktop site layout)
- Pinch-to-zoom (multi-touch)
- Camera & file uploads via WebChromeClient
- Download manager integration
- Swipe-to-refresh
- Video fullscreen support
- Custom JS dialogs (Info / Confirm / Prompt)
- Push notification permission (Android 13+)
- Deep linking support
- Back button navigation with exit prompt

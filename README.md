# Web App APK Deploy

Android WebView wrappers for web apps, built automatically with GitHub Actions.

## How it works

Each flavor in this repo wraps a different web app with a native `WebView` — JavaScript, file uploads, camera access, downloads, push notifications, and more.

When you push to `main`, GitHub Actions builds all flavors simultaneously. Download each APK from the **Actions** tab → click the latest run → **Artifacts**.

## Current flavors

| Flavor | App | URL | APK |
|--------|-----|-----|-----|
| `touchbase` | TouchBase | https://securepay-dashboard.pages.dev | `touchbase-debug` |
| `tbdata` | TB Data | https://touchbasedata.com/ | `tbdata-debug` |

## Adding a new flavor

1. Add a new `create("flavorName")` block in `app/build.gradle.kts`
2. Create `app/src/flavorName/res/values/strings.xml` with:
   - `app_name` — display name of the app
   - `app_url` — URL the WebView loads
3. Add icons in `app/src/flavorName/res/mipmap-*/ic_launcher.png` (48–192px, with ~20% padding)
4. Push — the workflow builds it automatically

Available on every build (no tag needed): the debug APK, downloadable from the workflow run's **Artifacts** section.

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
- 60% initial scale to fit content

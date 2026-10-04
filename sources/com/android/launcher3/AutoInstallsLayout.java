package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.util.Patterns;
import androidx.collection.Q;
import com.android.launcher3.LauncherProvider;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.graphics.LauncherIcons;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t1.C5596a;

/* JADX INFO: loaded from: classes2.dex */
public class AutoInstallsLayout {
    private static final String ACTION_APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE = "com.android.launcher.action.APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE";
    static final String ACTION_LAUNCHER_CUSTOMIZATION = "android.autoinstalls.config.action.PLAY_AUTO_INSTALL";
    private static final String ATTR_CLASS_NAME = "className";
    private static final String ATTR_CONTAINER = "container";
    private static final String ATTR_ICON = "icon";
    private static final String ATTR_KEY = "key";
    private static final String ATTR_PACKAGE_NAME = "packageName";
    private static final String ATTR_RANK = "rank";
    private static final String ATTR_SCREEN = "screen";
    private static final String ATTR_SPAN_X = "spanX";
    private static final String ATTR_SPAN_Y = "spanY";
    private static final String ATTR_TITLE = "title";
    private static final String ATTR_URL = "url";
    private static final String ATTR_VALUE = "value";
    private static final String ATTR_WORKSPACE = "workspace";
    private static final String ATTR_X = "x";
    private static final String ATTR_Y = "y";
    private static final String FORMATTED_LAYOUT_RES = "default_layout_%dx%d";
    private static final String FORMATTED_LAYOUT_RES_WITH_HOSTEAT = "default_layout_%dx%d_h%s";
    private static final String HOTSEAT_CONTAINER_NAME = LauncherSettings.Favorites.containerToString(LauncherSettings.Favorites.CONTAINER_HOTSEAT);
    private static final String LAYOUT_RES = "default_layout";
    private static final boolean LOGD = false;
    private static final String NAMESPACE = "http://schemas.android.com/apk/res-auto";
    private static final String TAG = "AutoInstalls";
    private static final String TAG_APPWIDGET = "appwidget";
    private static final String TAG_APP_ICON = "appicon";
    private static final String TAG_AUTO_INSTALL = "autoinstall";
    private static final String TAG_EXTRA = "extra";
    private static final String TAG_FOLDER = "folder";
    private static final String TAG_INCLUDE = "include";
    private static final String TAG_SHORTCUT = "shortcut";
    private static final String TAG_WORKSPACE = "workspace";
    final AppWidgetHost mAppWidgetHost;
    protected final LayoutParserCallback mCallback;
    private final int mColumnCount;
    final Context mContext;
    protected SQLiteDatabase mDb;
    private final InvariantDeviceProfile mIdp;
    protected final int mLayoutId;
    protected final PackageManager mPackageManager;
    protected final String mRootTag;
    private final int mRowCount;
    protected final Resources mSourceRes;
    private final long[] mTemp = new long[2];
    final ContentValues mValues = new ContentValues();

    public class AppShortcutParser implements TagParser {
        public AppShortcutParser() {
        }

        public long invalidPackageOrClass(XmlResourceParser xmlResourceParser) {
            Log.w(AutoInstallsLayout.TAG, "Skipping invalid <favorite> with no component");
            return -1L;
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) {
            ActivityInfo activityInfo;
            ComponentName componentName;
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "packageName");
            String attributeValue2 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "className");
            if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(attributeValue2)) {
                return invalidPackageOrClass(xmlResourceParser);
            }
            try {
                try {
                    componentName = new ComponentName(attributeValue, attributeValue2);
                    activityInfo = AutoInstallsLayout.this.mPackageManager.getActivityInfo(componentName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    ComponentName componentName2 = new ComponentName(AutoInstallsLayout.this.mPackageManager.currentToCanonicalPackageNames(new String[]{attributeValue})[0], attributeValue2);
                    activityInfo = AutoInstallsLayout.this.mPackageManager.getActivityInfo(componentName2, 0);
                    componentName = componentName2;
                }
                Intent flags = new Intent("android.intent.action.MAIN", (Uri) null).addCategory("android.intent.category.LAUNCHER").setComponent(componentName).setFlags(270532608);
                AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
                return autoInstallsLayout.addShortcut(activityInfo.loadLabel(autoInstallsLayout.mPackageManager).toString(), flags, 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.e(AutoInstallsLayout.TAG, "Favorite not found: " + attributeValue + RemoteSettings.FORWARD_SLASH_STRING + attributeValue2);
                return -1L;
            }
        }
    }

    public class AutoInstallParser implements TagParser {
        public AutoInstallParser() {
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "packageName");
            String attributeValue2 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "className");
            if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(attributeValue2)) {
                return -1L;
            }
            AutoInstallsLayout.this.mValues.put(LauncherSettings.Favorites.RESTORED, (Integer) 2);
            Intent flags = new Intent("android.intent.action.MAIN", (Uri) null).addCategory("android.intent.category.LAUNCHER").setComponent(new ComponentName(attributeValue, attributeValue2)).setFlags(270532608);
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            return autoInstallsLayout.addShortcut(autoInstallsLayout.mContext.getString(com.app.hider.master.promax.R.string.package_state_unknown), flags, 0);
        }
    }

    public class FolderParser implements TagParser {
        private final ArrayMap<String, TagParser> mFolderElements;

        public FolderParser(AutoInstallsLayout autoInstallsLayout) {
            this(autoInstallsLayout.getFolderElementsMap());
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
            int attributeResourceValue = AutoInstallsLayout.getAttributeResourceValue(xmlResourceParser, "title", 0);
            AutoInstallsLayout.this.mValues.put("title", attributeResourceValue != 0 ? AutoInstallsLayout.this.mSourceRes.getString(attributeResourceValue) : AutoInstallsLayout.this.mContext.getResources().getString(com.app.hider.master.promax.R.string.folder_name));
            AutoInstallsLayout.this.mValues.put(LauncherSettings.BaseLauncherColumns.ITEM_TYPE, (Integer) 2);
            AutoInstallsLayout.this.mValues.put("spanX", (Integer) 1);
            AutoInstallsLayout.this.mValues.put("spanY", (Integer) 1);
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            autoInstallsLayout.mValues.put("_id", Long.valueOf(autoInstallsLayout.mCallback.generateNewItemId()));
            AutoInstallsLayout autoInstallsLayout2 = AutoInstallsLayout.this;
            long jInsertAndCheck = autoInstallsLayout2.mCallback.insertAndCheck(autoInstallsLayout2.mDb, autoInstallsLayout2.mValues);
            if (jInsertAndCheck < 0) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues(AutoInstallsLayout.this.mValues);
            ArrayList arrayList = new ArrayList();
            int depth = xmlResourceParser.getDepth();
            int i10 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                    if (arrayList.size() >= 2) {
                        return jInsertAndCheck;
                    }
                    LauncherProvider.SqlArguments sqlArguments = new LauncherProvider.SqlArguments(LauncherSettings.Favorites.getContentUri(jInsertAndCheck), null, null);
                    AutoInstallsLayout.this.mDb.delete(sqlArguments.table, sqlArguments.where, sqlArguments.args);
                    if (arrayList.size() != 1) {
                        return -1L;
                    }
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("container", contentValues.getAsInteger("container"));
                    contentValues2.put("screen", contentValues.getAsInteger("screen"));
                    contentValues2.put(LauncherSettings.Favorites.CELLX, contentValues.getAsInteger(LauncherSettings.Favorites.CELLX));
                    contentValues2.put(LauncherSettings.Favorites.CELLY, contentValues.getAsInteger(LauncherSettings.Favorites.CELLY));
                    long jLongValue = ((Long) arrayList.get(0)).longValue();
                    AutoInstallsLayout.this.mDb.update(LauncherSettings.Favorites.TABLE_NAME, contentValues2, Q.a("_id=", jLongValue), null);
                    return jLongValue;
                }
                if (next == 2) {
                    AutoInstallsLayout.this.mValues.clear();
                    AutoInstallsLayout.this.mValues.put("container", Long.valueOf(jInsertAndCheck));
                    AutoInstallsLayout.this.mValues.put("rank", Integer.valueOf(i10));
                    TagParser tagParser = this.mFolderElements.get(xmlResourceParser.getName());
                    if (tagParser == null) {
                        throw new RuntimeException("Invalid folder item " + xmlResourceParser.getName());
                    }
                    long andAdd = tagParser.parseAndAdd(xmlResourceParser);
                    if (andAdd >= 0) {
                        arrayList.add(Long.valueOf(andAdd));
                        i10++;
                    }
                }
            }
        }

        public FolderParser(ArrayMap<String, TagParser> arrayMap) {
            this.mFolderElements = arrayMap;
        }
    }

    public interface LayoutParserCallback {
        long generateNewItemId();

        long insertAndCheck(SQLiteDatabase sQLiteDatabase, ContentValues contentValues);
    }

    public class PendingWidgetParser implements TagParser {
        public PendingWidgetParser() {
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "packageName");
            String attributeValue2 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "className");
            if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(attributeValue2)) {
                return -1L;
            }
            AutoInstallsLayout.this.mValues.put("spanX", AutoInstallsLayout.getAttributeValue(xmlResourceParser, "spanX"));
            AutoInstallsLayout.this.mValues.put("spanY", AutoInstallsLayout.getAttributeValue(xmlResourceParser, "spanY"));
            AutoInstallsLayout.this.mValues.put(LauncherSettings.BaseLauncherColumns.ITEM_TYPE, (Integer) 4);
            Bundle bundle = new Bundle();
            int depth = xmlResourceParser.getDepth();
            while (true) {
                int next = xmlResourceParser.next();
                if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                    return verifyAndInsert(new ComponentName(attributeValue, attributeValue2), bundle);
                }
                if (next == 2) {
                    if (!"extra".equals(xmlResourceParser.getName())) {
                        throw new RuntimeException("Widgets can contain only extras");
                    }
                    String attributeValue3 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "key");
                    String attributeValue4 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "value");
                    if (attributeValue3 == null || attributeValue4 == null) {
                        break;
                    }
                    bundle.putString(attributeValue3, attributeValue4);
                }
            }
            throw new RuntimeException("Widget extras must have a key and value");
        }

        public long verifyAndInsert(ComponentName componentName, Bundle bundle) {
            AutoInstallsLayout.this.mValues.put(LauncherSettings.Favorites.APPWIDGET_PROVIDER, componentName.flattenToString());
            AutoInstallsLayout.this.mValues.put(LauncherSettings.Favorites.RESTORED, (Integer) 35);
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            autoInstallsLayout.mValues.put("_id", Long.valueOf(autoInstallsLayout.mCallback.generateNewItemId()));
            if (!bundle.isEmpty()) {
                AutoInstallsLayout.this.mValues.put("intent", new Intent().putExtras(bundle).toUri(0));
            }
            AutoInstallsLayout autoInstallsLayout2 = AutoInstallsLayout.this;
            long jInsertAndCheck = autoInstallsLayout2.mCallback.insertAndCheck(autoInstallsLayout2.mDb, autoInstallsLayout2.mValues);
            if (jInsertAndCheck < 0) {
                return -1L;
            }
            return jInsertAndCheck;
        }
    }

    public class ShortcutParser implements TagParser {
        private final Resources mIconRes;

        public ShortcutParser(Resources resources) {
            this.mIconRes = resources;
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) {
            Intent intent;
            Drawable drawable;
            int attributeResourceValue = AutoInstallsLayout.getAttributeResourceValue(xmlResourceParser, "title", 0);
            int attributeResourceValue2 = AutoInstallsLayout.getAttributeResourceValue(xmlResourceParser, "icon", 0);
            C5596a.a("title: titleResId:", attributeResourceValue, AutoInstallsLayout.TAG);
            if (attributeResourceValue == 0 || attributeResourceValue2 == 0 || (intent = parseIntent(xmlResourceParser)) == null || (drawable = this.mIconRes.getDrawable(attributeResourceValue2)) == null) {
                return -1L;
            }
            LauncherIcons launcherIconsObtain = LauncherIcons.obtain(AutoInstallsLayout.this.mContext);
            AutoInstallsLayout.this.mValues.put("icon", Utilities.flattenBitmap(launcherIconsObtain.createBadgedIconBitmap(drawable, Process.myUserHandle(), Build.VERSION.SDK_INT).icon));
            launcherIconsObtain.recycle();
            AutoInstallsLayout.this.mValues.put(LauncherSettings.BaseLauncherColumns.ICON_PACKAGE, this.mIconRes.getResourcePackageName(attributeResourceValue2));
            AutoInstallsLayout.this.mValues.put(LauncherSettings.BaseLauncherColumns.ICON_RESOURCE, this.mIconRes.getResourceName(attributeResourceValue2));
            intent.setFlags(270532608);
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            return autoInstallsLayout.addShortcut(autoInstallsLayout.mSourceRes.getString(attributeResourceValue), intent, 1);
        }

        public Intent parseIntent(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "url");
            if (TextUtils.isEmpty(attributeValue) || !Patterns.WEB_URL.matcher(attributeValue).matches()) {
                return null;
            }
            return new Intent("android.intent.action.VIEW", (Uri) null).setData(Uri.parse(attributeValue));
        }
    }

    public interface TagParser {
        long parseAndAdd(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException;
    }

    public AutoInstallsLayout(Context context, AppWidgetHost appWidgetHost, LayoutParserCallback layoutParserCallback, Resources resources, int i10, String str) {
        this.mContext = context;
        this.mAppWidgetHost = appWidgetHost;
        this.mCallback = layoutParserCallback;
        this.mPackageManager = context.getPackageManager();
        this.mRootTag = str;
        this.mSourceRes = resources;
        this.mLayoutId = i10;
        InvariantDeviceProfile idp = LauncherAppState.getIDP(context);
        this.mIdp = idp;
        this.mRowCount = idp.numRows;
        this.mColumnCount = idp.numColumns;
    }

    public static void beginDocument(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xmlPullParser.getName().equals(str)) {
            return;
        }
        throw new XmlPullParserException("Unexpected start tag: found " + xmlPullParser.getName() + ", expected " + str);
    }

    private static String convertToDistanceFromEnd(String str, int i10) {
        int i11;
        return (TextUtils.isEmpty(str) || (i11 = Integer.parseInt(str)) >= 0) ? str : Integer.toString(i10 + i11);
    }

    public static void copyInteger(ContentValues contentValues, ContentValues contentValues2, String str) {
        contentValues2.put(str, contentValues.getAsInteger(str));
    }

    public static AutoInstallsLayout get(Context context, AppWidgetHost appWidgetHost, LayoutParserCallback layoutParserCallback) {
        Pair<String, Resources> pairFindSystemApk = Utilities.findSystemApk(ACTION_LAUNCHER_CUSTOMIZATION, context.getPackageManager());
        if (pairFindSystemApk == null) {
            return null;
        }
        Log.d(TAG, "getLayoutFromSystemApk pkg:" + ((String) pairFindSystemApk.first) + " res:" + pairFindSystemApk.second);
        return get(context, (String) pairFindSystemApk.first, (Resources) pairFindSystemApk.second, appWidgetHost, layoutParserCallback);
    }

    public static int getAttributeResourceValue(XmlResourceParser xmlResourceParser, String str, int i10) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(NAMESPACE, str, i10);
        Log.d(TAG, "getAttributeResourceValue attr:" + str + " value:" + attributeResourceValue);
        if (attributeResourceValue != i10) {
            return attributeResourceValue;
        }
        int attributeResourceValue2 = xmlResourceParser.getAttributeResourceValue(null, str, i10);
        Log.d(TAG, "getAttributeResourceValue attr:" + str + " value:" + attributeResourceValue2);
        return attributeResourceValue2;
    }

    public static String getAttributeValue(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue(NAMESPACE, str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }

    public long addShortcut(String str, Intent intent, int i10) {
        long jGenerateNewItemId = this.mCallback.generateNewItemId();
        this.mValues.put("intent", intent.toUri(0));
        this.mValues.put("title", str);
        this.mValues.put(LauncherSettings.BaseLauncherColumns.ITEM_TYPE, Integer.valueOf(i10));
        this.mValues.put("spanX", (Integer) 1);
        this.mValues.put("spanY", (Integer) 1);
        this.mValues.put("_id", Long.valueOf(jGenerateNewItemId));
        if (this.mCallback.insertAndCheck(this.mDb, this.mValues) < 0) {
            return -1L;
        }
        return jGenerateNewItemId;
    }

    public ArrayMap<String, TagParser> getFolderElementsMap() {
        ArrayMap<String, TagParser> arrayMap = new ArrayMap<>();
        arrayMap.put(TAG_APP_ICON, new AppShortcutParser());
        arrayMap.put(TAG_AUTO_INSTALL, new AutoInstallParser());
        arrayMap.put("shortcut", new ShortcutParser(this.mSourceRes));
        return arrayMap;
    }

    public ArrayMap<String, TagParser> getLayoutElementsMap() {
        ArrayMap<String, TagParser> arrayMap = new ArrayMap<>();
        arrayMap.put(TAG_APP_ICON, new AppShortcutParser());
        arrayMap.put(TAG_AUTO_INSTALL, new AutoInstallParser());
        arrayMap.put("folder", new FolderParser(getFolderElementsMap()));
        arrayMap.put("appwidget", new PendingWidgetParser());
        arrayMap.put("shortcut", new ShortcutParser(this.mSourceRes));
        return arrayMap;
    }

    public int loadLayout(SQLiteDatabase sQLiteDatabase, ArrayList<Long> arrayList) {
        this.mDb = sQLiteDatabase;
        try {
            return parseLayout(this.mLayoutId, arrayList);
        } catch (Exception e10) {
            Log.e(TAG, "Error parsing layout: ", e10);
            return -1;
        }
    }

    public int parseAndAddNode(XmlResourceParser xmlResourceParser, ArrayMap<String, TagParser> arrayMap, ArrayList<Long> arrayList) throws XmlPullParserException, IOException {
        if ("include".equals(xmlResourceParser.getName())) {
            int attributeResourceValue = getAttributeResourceValue(xmlResourceParser, "workspace", 0);
            if (attributeResourceValue != 0) {
                return parseLayout(attributeResourceValue, arrayList);
            }
        } else {
            this.mValues.clear();
            parseContainerAndScreen(xmlResourceParser, this.mTemp);
            long[] jArr = this.mTemp;
            long j10 = jArr[0];
            long j11 = jArr[1];
            this.mValues.put("container", Long.valueOf(j10));
            this.mValues.put("screen", Long.valueOf(j11));
            this.mValues.put(LauncherSettings.Favorites.CELLX, convertToDistanceFromEnd(getAttributeValue(xmlResourceParser, ATTR_X), this.mColumnCount));
            this.mValues.put(LauncherSettings.Favorites.CELLY, convertToDistanceFromEnd(getAttributeValue(xmlResourceParser, ATTR_Y), this.mRowCount));
            TagParser tagParser = arrayMap.get(xmlResourceParser.getName());
            if (tagParser != null && tagParser.parseAndAdd(xmlResourceParser) >= 0) {
                if (!arrayList.contains(Long.valueOf(j11)) && j10 == -100) {
                    arrayList.add(Long.valueOf(j11));
                }
                return 1;
            }
        }
        return 0;
    }

    public void parseContainerAndScreen(XmlResourceParser xmlResourceParser, long[] jArr) {
        if (!HOTSEAT_CONTAINER_NAME.equals(getAttributeValue(xmlResourceParser, "container"))) {
            jArr[0] = -100;
            jArr[1] = Long.parseLong(getAttributeValue(xmlResourceParser, "screen"));
            return;
        }
        jArr[0] = -101;
        long j10 = Long.parseLong(getAttributeValue(xmlResourceParser, "rank"));
        if (j10 >= this.mIdp.getAllAppsButtonRank()) {
            j10++;
        }
        jArr[1] = j10;
    }

    public int parseLayout(int i10, ArrayList<Long> arrayList) throws XmlPullParserException, IOException {
        XmlResourceParser xml = this.mSourceRes.getXml(i10);
        beginDocument(xml, this.mRootTag);
        int depth = xml.getDepth();
        ArrayMap<String, TagParser> layoutElementsMap = getLayoutElementsMap();
        int andAddNode = 0;
        while (true) {
            int next = xml.next();
            if ((next == 3 && xml.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                andAddNode += parseAndAddNode(xml, layoutElementsMap, arrayList);
            }
        }
        return andAddNode;
    }

    public static AutoInstallsLayout get(Context context, String str, Resources resources, AppWidgetHost appWidgetHost, LayoutParserCallback layoutParserCallback) {
        InvariantDeviceProfile idp = LauncherAppState.getIDP(context);
        Locale locale = Locale.ENGLISH;
        String str2 = String.format(locale, FORMATTED_LAYOUT_RES_WITH_HOSTEAT, Integer.valueOf(idp.numColumns), Integer.valueOf(idp.numRows), Integer.valueOf(idp.numHotseatIcons));
        int identifier = resources.getIdentifier(str2, "xml", str);
        if (identifier == 0) {
            Log.d(TAG, "Formatted layout: " + str2 + " not found. Trying layout without hosteat");
            str2 = String.format(locale, FORMATTED_LAYOUT_RES, Integer.valueOf(idp.numColumns), Integer.valueOf(idp.numRows));
            identifier = resources.getIdentifier(str2, "xml", str);
        }
        if (identifier == 0) {
            Log.d(TAG, "Formatted layout: " + str2 + " not found. Trying the default layout");
            identifier = resources.getIdentifier(LAYOUT_RES, "xml", str);
        }
        int i10 = identifier;
        if (i10 == 0) {
            Log.e(TAG, "Layout definition not found in package: " + str);
            return null;
        }
        return new AutoInstallsLayout(context, appWidgetHost, layoutParserCallback, resources, i10, "workspace");
    }
}

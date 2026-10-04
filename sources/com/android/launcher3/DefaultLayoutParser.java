package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.launcher3.AutoInstallsLayout;
import com.android.launcher3.LauncherSettings;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultLayoutParser extends AutoInstallsLayout {
    private static final String ACTION_APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE = "com.android.launcher.action.APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE";
    private static final String ATTR_CONTAINER = "container";
    private static final String ATTR_FOLDER_ITEMS = "folderItems";
    private static final String ATTR_SCREEN = "screen";
    protected static final String ATTR_URI = "uri";
    private static final String TAG = "DefaultLayoutParser";
    private static final String TAG_APPWIDGET = "appwidget";
    protected static final String TAG_FAVORITE = "favorite";
    private static final String TAG_FAVORITES = "favorites";
    private static final String TAG_FOLDER = "folder";
    private static final String TAG_PARTNER_FOLDER = "partner-folder";
    protected static final String TAG_RESOLVE = "resolve";
    protected static final String TAG_SHORTCUT = "shortcut";

    public class AppShortcutWithUriParser extends AutoInstallsLayout.AppShortcutParser {
        public AppShortcutWithUriParser() {
            super();
        }

        private ResolveInfo getSingleSystemActivity(List<ResolveInfo> list) {
            int size = list.size();
            ResolveInfo resolveInfo = null;
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    if ((DefaultLayoutParser.this.mPackageManager.getApplicationInfo(list.get(i10).activityInfo.packageName, 0).flags & 1) != 0) {
                        if (resolveInfo != null) {
                            return null;
                        }
                        resolveInfo = list.get(i10);
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w(DefaultLayoutParser.TAG, "Unable to get info about resolve results", e10);
                    return null;
                }
            }
            return resolveInfo;
        }

        private boolean wouldLaunchResolverActivity(ResolveInfo resolveInfo, List<ResolveInfo> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                ResolveInfo resolveInfo2 = list.get(i10);
                if (resolveInfo2.activityInfo.name.equals(resolveInfo.activityInfo.name) && resolveInfo2.activityInfo.packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.android.launcher3.AutoInstallsLayout.AppShortcutParser
        public long invalidPackageOrClass(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "uri");
            if (TextUtils.isEmpty(attributeValue)) {
                Log.e(DefaultLayoutParser.TAG, "Skipping invalid <favorite> with no component or uri");
                return -1L;
            }
            try {
                Intent uri = Intent.parseUri(attributeValue, 0);
                ResolveInfo resolveInfoResolveActivity = DefaultLayoutParser.this.mPackageManager.resolveActivity(uri, 65536);
                List<ResolveInfo> listQueryIntentActivities = DefaultLayoutParser.this.mPackageManager.queryIntentActivities(uri, 65536);
                if (wouldLaunchResolverActivity(resolveInfoResolveActivity, listQueryIntentActivities) && (resolveInfoResolveActivity = getSingleSystemActivity(listQueryIntentActivities)) == null) {
                    Log.w(DefaultLayoutParser.TAG, "No preference or single system activity found for " + uri.toString());
                    return -1L;
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent launchIntentForPackage = DefaultLayoutParser.this.mPackageManager.getLaunchIntentForPackage(activityInfo.packageName);
                if (launchIntentForPackage == null) {
                    return -1L;
                }
                launchIntentForPackage.setFlags(270532608);
                DefaultLayoutParser defaultLayoutParser = DefaultLayoutParser.this;
                return defaultLayoutParser.addShortcut(activityInfo.loadLabel(defaultLayoutParser.mPackageManager).toString(), launchIntentForPackage, 0);
            } catch (URISyntaxException e10) {
                Log.e(DefaultLayoutParser.TAG, "Unable to add meta-favorite: " + attributeValue, e10);
                return -1L;
            }
        }

        @Override // com.android.launcher3.AutoInstallsLayout.AppShortcutParser, com.android.launcher3.AutoInstallsLayout.TagParser
        public /* bridge */ /* synthetic */ long parseAndAdd(XmlResourceParser xmlResourceParser) {
            return super.parseAndAdd(xmlResourceParser);
        }
    }

    public class AppWidgetParser extends AutoInstallsLayout.PendingWidgetParser {
        public AppWidgetParser() {
            super();
        }

        @Override // com.android.launcher3.AutoInstallsLayout.PendingWidgetParser
        public long verifyAndInsert(ComponentName componentName, Bundle bundle) {
            int iAllocateAppWidgetId;
            long jInsertAndCheck = -1;
            try {
                DefaultLayoutParser.this.mPackageManager.getReceiverInfo(componentName, 0);
            } catch (Exception unused) {
                ComponentName componentName2 = new ComponentName(DefaultLayoutParser.this.mPackageManager.currentToCanonicalPackageNames(new String[]{componentName.getPackageName()})[0], componentName.getClassName());
                try {
                    DefaultLayoutParser.this.mPackageManager.getReceiverInfo(componentName2, 0);
                    componentName = componentName2;
                } catch (Exception unused2) {
                    Log.d(DefaultLayoutParser.TAG, "Can't find widget provider: " + componentName2.getClassName());
                    return -1L;
                }
            }
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(DefaultLayoutParser.this.mContext);
            try {
                iAllocateAppWidgetId = DefaultLayoutParser.this.mAppWidgetHost.allocateAppWidgetId();
            } catch (RuntimeException e10) {
                Log.e(DefaultLayoutParser.TAG, "Problem allocating appWidgetId", e10);
            }
            if (!appWidgetManager.bindAppWidgetIdIfAllowed(iAllocateAppWidgetId, componentName)) {
                Log.e(DefaultLayoutParser.TAG, "Unable to bind app widget id " + componentName);
                DefaultLayoutParser.this.mAppWidgetHost.deleteAppWidgetId(iAllocateAppWidgetId);
                return -1L;
            }
            DefaultLayoutParser.this.mValues.put(LauncherSettings.Favorites.APPWIDGET_ID, Integer.valueOf(iAllocateAppWidgetId));
            DefaultLayoutParser.this.mValues.put(LauncherSettings.Favorites.APPWIDGET_PROVIDER, componentName.flattenToString());
            DefaultLayoutParser defaultLayoutParser = DefaultLayoutParser.this;
            defaultLayoutParser.mValues.put("_id", Long.valueOf(defaultLayoutParser.mCallback.generateNewItemId()));
            DefaultLayoutParser defaultLayoutParser2 = DefaultLayoutParser.this;
            jInsertAndCheck = defaultLayoutParser2.mCallback.insertAndCheck(defaultLayoutParser2.mDb, defaultLayoutParser2.mValues);
            if (jInsertAndCheck < 0) {
                DefaultLayoutParser.this.mAppWidgetHost.deleteAppWidgetId(iAllocateAppWidgetId);
                return jInsertAndCheck;
            }
            if (!bundle.isEmpty()) {
                Intent intent = new Intent(DefaultLayoutParser.ACTION_APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE);
                intent.setComponent(componentName);
                intent.putExtras(bundle);
                intent.putExtra(LauncherSettings.Favorites.APPWIDGET_ID, iAllocateAppWidgetId);
                DefaultLayoutParser.this.mContext.sendBroadcast(intent);
            }
            return jInsertAndCheck;
        }
    }

    public class MyFolderParser extends AutoInstallsLayout.FolderParser {
        public MyFolderParser() {
            super(DefaultLayoutParser.this);
        }

        @Override // com.android.launcher3.AutoInstallsLayout.FolderParser, com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
            int attributeResourceValue = AutoInstallsLayout.getAttributeResourceValue(xmlResourceParser, DefaultLayoutParser.ATTR_FOLDER_ITEMS, 0);
            if (attributeResourceValue != 0) {
                xmlResourceParser = DefaultLayoutParser.this.mSourceRes.getXml(attributeResourceValue);
                AutoInstallsLayout.beginDocument(xmlResourceParser, "folder");
            }
            return super.parseAndAdd(xmlResourceParser);
        }
    }

    public class PartnerFolderParser implements AutoInstallsLayout.TagParser {
        public PartnerFolderParser() {
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
            Resources resources;
            int identifier;
            Partner partner = Partner.get(DefaultLayoutParser.this.mPackageManager);
            if (partner == null || (identifier = (resources = partner.getResources()).getIdentifier(Partner.RES_FOLDER, "xml", partner.getPackageName())) == 0) {
                return -1L;
            }
            XmlResourceParser xml = resources.getXml(identifier);
            AutoInstallsLayout.beginDocument(xml, "folder");
            DefaultLayoutParser defaultLayoutParser = DefaultLayoutParser.this;
            return new AutoInstallsLayout.FolderParser(defaultLayoutParser.getFolderElementsMap(resources)).parseAndAdd(xml);
        }
    }

    public class ResolveParser implements AutoInstallsLayout.TagParser {
        private final AppShortcutWithUriParser mChildParser;

        public ResolveParser() {
            this.mChildParser = DefaultLayoutParser.this.new AppShortcutWithUriParser();
        }

        @Override // com.android.launcher3.AutoInstallsLayout.TagParser
        public long parseAndAdd(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
            int depth = xmlResourceParser.getDepth();
            long andAdd = -1;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                    return andAdd;
                }
                if (next == 2 && andAdd <= -1) {
                    String name = xmlResourceParser.getName();
                    if (DefaultLayoutParser.TAG_FAVORITE.equals(name)) {
                        andAdd = this.mChildParser.parseAndAdd(xmlResourceParser);
                    } else {
                        Log.e(DefaultLayoutParser.TAG, "Fallback groups can contain only favorites, found " + name);
                    }
                }
            }
        }
    }

    public class UriShortcutParser extends AutoInstallsLayout.ShortcutParser {
        public UriShortcutParser(Resources resources) {
            super(resources);
        }

        @Override // com.android.launcher3.AutoInstallsLayout.ShortcutParser, com.android.launcher3.AutoInstallsLayout.TagParser
        public /* bridge */ /* synthetic */ long parseAndAdd(XmlResourceParser xmlResourceParser) {
            return super.parseAndAdd(xmlResourceParser);
        }

        @Override // com.android.launcher3.AutoInstallsLayout.ShortcutParser
        public Intent parseIntent(XmlResourceParser xmlResourceParser) {
            String attributeValue;
            try {
                attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "uri");
                try {
                    Log.d(DefaultLayoutParser.TAG, "UriShortcutParser:" + attributeValue);
                    return Intent.parseUri(attributeValue, 0);
                } catch (URISyntaxException e10) {
                    e = e10;
                    Log.e(DefaultLayoutParser.TAG, "Shortcut has malformed uri: " + attributeValue, e);
                    return null;
                }
            } catch (URISyntaxException e11) {
                e = e11;
                attributeValue = null;
            }
        }
    }

    public DefaultLayoutParser(Context context, AppWidgetHost appWidgetHost, AutoInstallsLayout.LayoutParserCallback layoutParserCallback, Resources resources, int i10) {
        super(context, appWidgetHost, layoutParserCallback, resources, i10, "favorites");
    }

    @Override // com.android.launcher3.AutoInstallsLayout
    public ArrayMap<String, AutoInstallsLayout.TagParser> getFolderElementsMap() {
        return getFolderElementsMap(this.mSourceRes);
    }

    @Override // com.android.launcher3.AutoInstallsLayout
    public ArrayMap<String, AutoInstallsLayout.TagParser> getLayoutElementsMap() {
        ArrayMap<String, AutoInstallsLayout.TagParser> arrayMap = new ArrayMap<>();
        arrayMap.put(TAG_FAVORITE, new AppShortcutWithUriParser());
        arrayMap.put("appwidget", new AppWidgetParser());
        arrayMap.put("shortcut", new UriShortcutParser(this.mSourceRes));
        arrayMap.put(TAG_RESOLVE, new ResolveParser());
        arrayMap.put("folder", new MyFolderParser());
        arrayMap.put(TAG_PARTNER_FOLDER, new PartnerFolderParser());
        return arrayMap;
    }

    @Override // com.android.launcher3.AutoInstallsLayout
    public void parseContainerAndScreen(XmlResourceParser xmlResourceParser, long[] jArr) {
        jArr[0] = -100;
        String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "container");
        if (attributeValue != null) {
            jArr[0] = Long.valueOf(attributeValue).longValue();
        }
        jArr[1] = Long.parseLong(AutoInstallsLayout.getAttributeValue(xmlResourceParser, "screen"));
    }

    public ArrayMap<String, AutoInstallsLayout.TagParser> getFolderElementsMap(Resources resources) {
        ArrayMap<String, AutoInstallsLayout.TagParser> arrayMap = new ArrayMap<>();
        arrayMap.put(TAG_FAVORITE, new AppShortcutWithUriParser());
        arrayMap.put("shortcut", new UriShortcutParser(resources));
        return arrayMap;
    }
}

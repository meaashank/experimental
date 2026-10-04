package com.android.launcher3;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.O;
import androidx.collection.M0;
import com.android.launcher3.AutoInstallsLayout;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.config.FeatureFlags;
import com.android.launcher3.logging.FileLog;
import com.android.launcher3.model.DbDowngradeHelper;
import com.android.launcher3.provider.LauncherDbUtils;
import com.android.launcher3.provider.RestoreDbTask;
import com.android.launcher3.util.NoLocaleSQLiteHelper;
import com.android.launcher3.util.Preconditions;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class LauncherProvider extends ContentProvider {
    public static final String AUTHORITY = FeatureFlags.AUTHORITY;
    private static final String DOWNGRADE_SCHEMA_FILE = "downgrade_schema.json";
    static final String EMPTY_DATABASE_CREATED = "EMPTY_DATABASE_CREATED";
    private static final boolean LOGD = false;
    private static final String RESTRICTION_PACKAGE_NAME = "workspace.configuration.package.adNetworkName";
    public static final int SCHEMA_VERSION = 27;
    private static final String TAG = "LauncherProvider";
    private Handler mListenerHandler;
    private final ChangeListenerWrapper mListenerWrapper = new ChangeListenerWrapper();
    protected DatabaseHelper mOpenHelper;

    public static class ChangeListenerWrapper implements Handler.Callback {
        private static final int MSG_APP_WIDGET_HOST_RESET = 2;
        private static final int MSG_LAUNCHER_PROVIDER_CHANGED = 1;
        private LauncherProviderChangeListener mListener;

        private ChangeListenerWrapper() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LauncherProviderChangeListener launcherProviderChangeListener = this.mListener;
            if (launcherProviderChangeListener != null) {
                int i10 = message.what;
                if (i10 == 1) {
                    launcherProviderChangeListener.onLauncherProviderChanged();
                } else if (i10 == 2) {
                    launcherProviderChangeListener.onAppWidgetHostReset();
                    return true;
                }
            }
            return true;
        }

        public ChangeListenerWrapper(C c10) {
        }
    }

    public static void addModifiedTime(ContentValues contentValues) {
        contentValues.put(LauncherSettings.ChangeLogColumns.MODIFIED, Long.valueOf(System.currentTimeMillis()));
    }

    private void clearFlagEmptyDbCreated() {
        Utilities.getPrefs(getContext()).edit().remove(EMPTY_DATABASE_CREATED).commit();
    }

    private AutoInstallsLayout createWorkspaceLoaderFromAppRestriction(AppWidgetHost appWidgetHost) {
        String string;
        Context context = getContext();
        Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions != null && (string = applicationRestrictions.getString(RESTRICTION_PACKAGE_NAME)) != null) {
            try {
                return AutoInstallsLayout.get(context, string, context.getPackageManager().getResourcesForApplication(string), appWidgetHost, this.mOpenHelper);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(TAG, "Target package for restricted profile not found", e10);
            }
        }
        return null;
    }

    public static long dbInsertAndCheck(DatabaseHelper databaseHelper, SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues) {
        if (contentValues == null) {
            throw new RuntimeException("Error: attempting to insert null values");
        }
        if (!contentValues.containsKey("_id")) {
            throw new RuntimeException("Error: attempting to add item without specifying an id");
        }
        databaseHelper.checkId(str, contentValues);
        return sQLiteDatabase.insert(str, str2, contentValues);
    }

    private ArrayList<Long> deleteEmptyFolders() {
        ArrayList<Long> arrayList = new ArrayList<>();
        SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        try {
            LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(writableDatabase);
            try {
                Cursor cursorQuery = writableDatabase.query(LauncherSettings.Favorites.TABLE_NAME, new String[]{"_id"}, "itemType = 2 AND _id NOT IN (SELECT container FROM favorites)", null, null, null, null);
                try {
                    LauncherDbUtils.iterateCursor(cursorQuery, 0, arrayList);
                    cursorQuery.close();
                    if (!arrayList.isEmpty()) {
                        writableDatabase.delete(LauncherSettings.Favorites.TABLE_NAME, Utilities.createDbSelectionQuery("_id", arrayList), null);
                    }
                    sQLiteTransaction.commit();
                    sQLiteTransaction.close();
                    return arrayList;
                } finally {
                    Log.e(TAG, e.getMessage(), e);
                    arrayList.clear();
                    return arrayList;
                }
            } finally {
            }
        } catch (SQLException e10) {
            Log.e(TAG, e10.getMessage(), e10);
            arrayList.clear();
            return arrayList;
        }
    }

    private DefaultLayoutParser getDefaultLayoutParser(AppWidgetHost appWidgetHost) {
        int i10;
        InvariantDeviceProfile idp = LauncherAppState.getIDP(getContext());
        return new DefaultLayoutParser(getContext(), appWidgetHost, this.mOpenHelper, getContext().getResources(), (!UserManagerCompat.getInstance(getContext()).isDemoUser() || (i10 = idp.demoModeLayoutId) == 0) ? idp.defaultLayoutId : i10);
    }

    public static long getMaxId(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM " + str, null);
        long j10 = (cursorRawQuery == null || !cursorRawQuery.moveToNext()) ? -1L : cursorRawQuery.getLong(0);
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        if (j10 != -1) {
            return j10;
        }
        throw new RuntimeException(w.y.a("Error: could not query max id in ", str));
    }

    private boolean initializeExternalAdd(ContentValues contentValues) {
        contentValues.put("_id", Long.valueOf(this.mOpenHelper.generateNewItemId()));
        Integer asInteger = contentValues.getAsInteger(LauncherSettings.BaseLauncherColumns.ITEM_TYPE);
        if (asInteger != null && asInteger.intValue() == 4 && !contentValues.containsKey(LauncherSettings.Favorites.APPWIDGET_ID)) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(getContext());
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(contentValues.getAsString(LauncherSettings.Favorites.APPWIDGET_PROVIDER));
            if (componentNameUnflattenFromString != null) {
                try {
                    AppWidgetHost appWidgetHostNewLauncherWidgetHost = this.mOpenHelper.newLauncherWidgetHost();
                    int iAllocateAppWidgetId = appWidgetHostNewLauncherWidgetHost.allocateAppWidgetId();
                    contentValues.put(LauncherSettings.Favorites.APPWIDGET_ID, Integer.valueOf(iAllocateAppWidgetId));
                    if (!appWidgetManager.bindAppWidgetIdIfAllowed(iAllocateAppWidgetId, componentNameUnflattenFromString)) {
                        appWidgetHostNewLauncherWidgetHost.deleteAppWidgetId(iAllocateAppWidgetId);
                        return false;
                    }
                } catch (RuntimeException e10) {
                    Log.e(TAG, "Failed to initialize external widget", e10);
                }
            }
            return false;
        }
        long jLongValue = contentValues.getAsLong(LauncherSettings.Favorites.SCREEN).longValue();
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            sQLiteStatementCompileStatement = this.mOpenHelper.getWritableDatabase().compileStatement("INSERT OR IGNORE INTO workspaceScreens (_id, screenRank) select ?, (ifnull(MAX(screenRank), -1)+1) from workspaceScreens");
            sQLiteStatementCompileStatement.bindLong(1, jLongValue);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("_id", Long.valueOf(sQLiteStatementCompileStatement.executeInsert()));
            this.mOpenHelper.checkId(LauncherSettings.WorkspaceScreens.TABLE_NAME, contentValues2);
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            Utilities.closeSilently(sQLiteStatementCompileStatement);
        }
    }

    private synchronized void loadDefaultFavoritesIfNecessary() {
        try {
            if (Utilities.getPrefs(getContext()).getBoolean(EMPTY_DATABASE_CREATED, false)) {
                Log.d(TAG, "loading default workspace");
                AppWidgetHost appWidgetHostNewLauncherWidgetHost = this.mOpenHelper.newLauncherWidgetHost();
                AutoInstallsLayout autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction = createWorkspaceLoaderFromAppRestriction(appWidgetHostNewLauncherWidgetHost);
                Log.d(TAG, "createWorkspaceLoaderFromAppRestriction: " + autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction);
                boolean z10 = autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction != null;
                Log.d(TAG, "usingExternallyProvidedLayout:" + z10);
                if (autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction == null) {
                    autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction = getDefaultLayoutParser(appWidgetHostNewLauncherWidgetHost);
                    Log.d(TAG, "default loader:" + autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction);
                }
                DatabaseHelper databaseHelper = this.mOpenHelper;
                databaseHelper.createEmptyDB(databaseHelper.getWritableDatabase());
                DatabaseHelper databaseHelper2 = this.mOpenHelper;
                if (databaseHelper2.loadFavorites(databaseHelper2.getWritableDatabase(), autoInstallsLayoutCreateWorkspaceLoaderFromAppRestriction) <= 0 && z10) {
                    DatabaseHelper databaseHelper3 = this.mOpenHelper;
                    databaseHelper3.createEmptyDB(databaseHelper3.getWritableDatabase());
                    DatabaseHelper databaseHelper4 = this.mOpenHelper;
                    databaseHelper4.loadFavorites(databaseHelper4.getWritableDatabase(), getDefaultLayoutParser(appWidgetHostNewLauncherWidgetHost));
                }
                clearFlagEmptyDbCreated();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void reloadLauncherIfExternal() {
        LauncherAppState instanceNoCreate;
        if (!Utilities.ATLEAST_MARSHMALLOW || Binder.getCallingPid() == Process.myPid() || (instanceNoCreate = LauncherAppState.getInstanceNoCreate()) == null) {
            return;
        }
        instanceNoCreate.getModel().forceReload();
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        createDbIfNotExists();
        LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(this.mOpenHelper.getWritableDatabase());
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = super.applyBatch(arrayList);
            sQLiteTransaction.commit();
            reloadLauncherIfExternal();
            sQLiteTransaction.close();
            return contentProviderResultArrApplyBatch;
        } catch (Throwable th) {
            try {
                sQLiteTransaction.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        createDbIfNotExists();
        SqlArguments sqlArguments = new SqlArguments(uri);
        SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(writableDatabase);
        try {
            int length = contentValuesArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                addModifiedTime(contentValuesArr[i10]);
                if (dbInsertAndCheck(this.mOpenHelper, writableDatabase, sqlArguments.table, null, contentValuesArr[i10]) < 0) {
                    sQLiteTransaction.close();
                    return 0;
                }
            }
            sQLiteTransaction.commit();
            sQLiteTransaction.close();
            notifyListeners();
            reloadLauncherIfExternal();
            return contentValuesArr.length;
        } catch (Throwable th) {
            try {
                sQLiteTransaction.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (Binder.getCallingUid() == Process.myUid()) {
            createDbIfNotExists();
            str.getClass();
            switch (str) {
                case "delete_empty_folders":
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("value", deleteEmptyFolders());
                    break;
                case "remove_ghost_widgets":
                    DatabaseHelper databaseHelper = this.mOpenHelper;
                    databaseHelper.removeGhostWidgets(databaseHelper.getWritableDatabase());
                    break;
                case "generate_new_item_id":
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("value", this.mOpenHelper.generateNewItemId());
                    break;
                case "generate_new_screen_id":
                    Bundle bundle4 = new Bundle();
                    bundle4.putLong("value", this.mOpenHelper.generateNewScreenId());
                    break;
                case "clear_empty_db_flag":
                    clearFlagEmptyDbCreated();
                    break;
                case "load_default_favorites":
                    loadDefaultFavoritesIfNecessary();
                    break;
                case "get_empty_db_flag":
                    Bundle bundle5 = new Bundle();
                    bundle5.putBoolean("value", Utilities.getPrefs(getContext()).getBoolean(EMPTY_DATABASE_CREATED, false));
                    break;
                case "create_empty_db":
                    DatabaseHelper databaseHelper2 = this.mOpenHelper;
                    databaseHelper2.createEmptyDB(databaseHelper2.getWritableDatabase());
                    break;
            }
        }
        return null;
    }

    public synchronized void createDbIfNotExists() {
        try {
            if (this.mOpenHelper == null) {
                this.mOpenHelper = new DatabaseHelper(getContext(), this.mListenerHandler);
                if (RestoreDbTask.isPending(getContext())) {
                    if (!RestoreDbTask.performRestore(this.mOpenHelper)) {
                        DatabaseHelper databaseHelper = this.mOpenHelper;
                        databaseHelper.createEmptyDB(databaseHelper.getWritableDatabase());
                    }
                    RestoreDbTask.setPending(getContext(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        createDbIfNotExists();
        SqlArguments sqlArguments = new SqlArguments(uri, str, strArr);
        SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        if (Binder.getCallingPid() != Process.myPid() && LauncherSettings.Favorites.TABLE_NAME.equalsIgnoreCase(sqlArguments.table)) {
            DatabaseHelper databaseHelper = this.mOpenHelper;
            databaseHelper.removeGhostWidgets(databaseHelper.getWritableDatabase());
        }
        int iDelete = writableDatabase.delete(sqlArguments.table, sqlArguments.where, sqlArguments.args);
        if (iDelete > 0) {
            notifyListeners();
            reloadLauncherIfExternal();
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LauncherAppState instanceNoCreate = LauncherAppState.getInstanceNoCreate();
        if (instanceNoCreate == null || !instanceNoCreate.getModel().isModelLoaded()) {
            return;
        }
        instanceNoCreate.getModel().dumpState("", fileDescriptor, printWriter, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        SqlArguments sqlArguments = new SqlArguments(uri, null, null);
        if (TextUtils.isEmpty(sqlArguments.where)) {
            return "vnd.android.cursor.dir/" + sqlArguments.table;
        }
        return "vnd.android.cursor.item/" + sqlArguments.table;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        createDbIfNotExists();
        SqlArguments sqlArguments = new SqlArguments(uri);
        if (Binder.getCallingPid() == Process.myPid() || initializeExternalAdd(contentValues)) {
            SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
            addModifiedTime(contentValues);
            long jDbInsertAndCheck = dbInsertAndCheck(this.mOpenHelper, writableDatabase, sqlArguments.table, null, contentValues);
            if (jDbInsertAndCheck >= 0) {
                Uri uriWithAppendedId = ContentUris.withAppendedId(uri, jDbInsertAndCheck);
                notifyListeners();
                if (Utilities.ATLEAST_MARSHMALLOW) {
                    reloadLauncherIfExternal();
                    return uriWithAppendedId;
                }
                LauncherAppState instanceNoCreate = LauncherAppState.getInstanceNoCreate();
                if (instanceNoCreate != null && "true".equals(uriWithAppendedId.getQueryParameter("isExternalAdd"))) {
                    instanceNoCreate.getModel().forceReload();
                }
                String queryParameter = uriWithAppendedId.getQueryParameter("notify");
                if (queryParameter != null && !"true".equals(queryParameter)) {
                    return uriWithAppendedId;
                }
                getContext().getContentResolver().notifyChange(uriWithAppendedId, null);
                return uriWithAppendedId;
            }
        }
        return null;
    }

    public void notifyListeners() {
        this.mListenerHandler.sendEmptyMessage(1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Log.d(TAG, "Launcher process started");
        this.mListenerHandler = new Handler(this.mListenerWrapper);
        MainProcessInitializer.initialize(getContext().getApplicationContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        createDbIfNotExists();
        SqlArguments sqlArguments = new SqlArguments(uri, str, strArr2);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(sqlArguments.table);
        Cursor cursorQuery = sQLiteQueryBuilder.query(this.mOpenHelper.getWritableDatabase(), strArr, sqlArguments.where, sqlArguments.args, null, null, str2);
        cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        return cursorQuery;
    }

    public void setLauncherProviderChangeListener(LauncherProviderChangeListener launcherProviderChangeListener) {
        Preconditions.assertUIThread();
        this.mListenerWrapper.mListener = launcherProviderChangeListener;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        createDbIfNotExists();
        SqlArguments sqlArguments = new SqlArguments(uri, str, strArr);
        addModifiedTime(contentValues);
        int iUpdate = this.mOpenHelper.getWritableDatabase().update(sqlArguments.table, contentValues, sqlArguments.where, sqlArguments.args);
        if (iUpdate > 0) {
            notifyListeners();
        }
        reloadLauncherIfExternal();
        return iUpdate;
    }

    public static class DatabaseHelper extends NoLocaleSQLiteHelper implements AutoInstallsLayout.LayoutParserCallback {
        private final Context mContext;
        private long mMaxItemId;
        private long mMaxScreenId;
        private final Handler mWidgetHostResetHandler;

        public DatabaseHelper(Context context, Handler handler) {
            this(context, handler, LauncherFiles.LAUNCHER_DB);
            if (!tableExists(LauncherSettings.Favorites.TABLE_NAME) || !tableExists(LauncherSettings.WorkspaceScreens.TABLE_NAME)) {
                Log.e(LauncherProvider.TAG, "Tables are missing after onCreate has been called. Trying to recreate");
                addFavoritesTable(getWritableDatabase(), true);
                addWorkspacesTable(getWritableDatabase(), true);
            }
            initIds();
        }

        private void addFavoritesTable(SQLiteDatabase sQLiteDatabase, boolean z10) {
            LauncherSettings.Favorites.addTableToDb(sQLiteDatabase, getDefaultUserSerial(), z10);
        }

        private boolean addIntegerColumn(SQLiteDatabase sQLiteDatabase, String str, long j10) {
            try {
                LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(sQLiteDatabase);
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE favorites ADD COLUMN " + str + " INTEGER NOT NULL DEFAULT " + j10 + ";");
                    sQLiteTransaction.commit();
                    sQLiteTransaction.close();
                    return true;
                } finally {
                }
            } catch (SQLException e10) {
                Log.e(LauncherProvider.TAG, e10.getMessage(), e10);
                return false;
            }
        }

        private boolean addProfileColumn(SQLiteDatabase sQLiteDatabase) {
            return addIntegerColumn(sQLiteDatabase, LauncherSettings.Favorites.PROFILE_ID, getDefaultUserSerial());
        }

        private void addWorkspacesTable(SQLiteDatabase sQLiteDatabase, boolean z10) {
            sQLiteDatabase.execSQL("CREATE TABLE " + (z10 ? " IF NOT EXISTS " : "") + "workspaceScreens (_id INTEGER PRIMARY KEY,screenRank INTEGER,modified INTEGER NOT NULL DEFAULT 0);");
        }

        private long initializeMaxItemId(SQLiteDatabase sQLiteDatabase) {
            return LauncherProvider.getMaxId(sQLiteDatabase, LauncherSettings.Favorites.TABLE_NAME);
        }

        private long initializeMaxScreenId(SQLiteDatabase sQLiteDatabase) {
            return LauncherProvider.getMaxId(sQLiteDatabase, LauncherSettings.WorkspaceScreens.TABLE_NAME);
        }

        private void removeOrphanedItems(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DELETE FROM favorites WHERE screen NOT IN (SELECT _id FROM workspaceScreens) AND container = -100");
            sQLiteDatabase.execSQL("DELETE FROM favorites WHERE container <> -100 AND container <> -101 AND container NOT IN (SELECT _id FROM favorites WHERE itemType = 2)");
        }

        private boolean tableExists(String str) {
            Cursor cursorQuery = getReadableDatabase().query(true, "sqlite_master", new String[]{"tbl_name"}, "tbl_name = ?", new String[]{str}, null, null, null, null, null);
            try {
                return cursorQuery.getCount() > 0;
            } finally {
                cursorQuery.close();
            }
        }

        public void checkId(String str, ContentValues contentValues) {
            long jLongValue = contentValues.getAsLong("_id").longValue();
            if (LauncherSettings.WorkspaceScreens.TABLE_NAME.equals(str)) {
                this.mMaxScreenId = Math.max(jLongValue, this.mMaxScreenId);
            } else {
                this.mMaxItemId = Math.max(jLongValue, this.mMaxItemId);
            }
        }

        public void convertShortcutsToLauncherActivities(SQLiteDatabase sQLiteDatabase) {
            LauncherDbUtils.SQLiteTransaction sQLiteTransaction;
            Cursor cursorQuery;
            try {
                sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(sQLiteDatabase);
                try {
                    cursorQuery = sQLiteDatabase.query(LauncherSettings.Favorites.TABLE_NAME, new String[]{"_id", "intent"}, "itemType=1 AND profileId=" + getDefaultUserSerial(), null, null, null, null);
                } finally {
                }
            } catch (SQLException e10) {
                Log.w(LauncherProvider.TAG, "Error deduping shortcuts", e10);
            }
            try {
                SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("UPDATE favorites SET itemType=0 WHERE _id=?");
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("intent");
                    while (cursorQuery.moveToNext()) {
                        try {
                            if (Utilities.isLauncherAppTarget(Intent.parseUri(cursorQuery.getString(columnIndexOrThrow2), 0))) {
                                sQLiteStatementCompileStatement.bindLong(1, cursorQuery.getLong(columnIndexOrThrow));
                                sQLiteStatementCompileStatement.executeUpdateDelete();
                            }
                        } catch (URISyntaxException e11) {
                            Log.e(LauncherProvider.TAG, "Unable to parse intent", e11);
                        }
                    }
                    sQLiteTransaction.commit();
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                    cursorQuery.close();
                    sQLiteTransaction.close();
                } finally {
                }
            } finally {
                Log.w(LauncherProvider.TAG, "Error deduping shortcuts", e10);
            }
        }

        public void createEmptyDB(SQLiteDatabase sQLiteDatabase) {
            LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(sQLiteDatabase);
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favorites");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS workspaceScreens");
                onCreate(sQLiteDatabase);
                sQLiteTransaction.commit();
                sQLiteTransaction.close();
            } catch (Throwable th) {
                try {
                    sQLiteTransaction.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // com.android.launcher3.AutoInstallsLayout.LayoutParserCallback
        public long generateNewItemId() {
            long j10 = this.mMaxItemId;
            if (j10 < 0) {
                throw new RuntimeException("Error: max item id was not initialized");
            }
            long j11 = j10 + 1;
            this.mMaxItemId = j11;
            return j11;
        }

        public long generateNewScreenId() {
            long j10 = this.mMaxScreenId;
            if (j10 < 0) {
                throw new RuntimeException("Error: max screen id was not initialized");
            }
            long j11 = j10 + 1;
            this.mMaxScreenId = j11;
            return j11;
        }

        public long getDefaultUserSerial() {
            return UserManagerCompat.getInstance(this.mContext).getSerialNumberForUser(Process.myUserHandle());
        }

        public void handleOneTimeDataUpgrade(SQLiteDatabase sQLiteDatabase) {
            UserManagerCompat userManagerCompat = UserManagerCompat.getInstance(this.mContext);
            Iterator<UserHandle> it = userManagerCompat.getUserProfiles().iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("update favorites set intent = replace(intent, ';l.profile=" + userManagerCompat.getSerialNumberForUser(it.next()) + ";', ';') where itemType = 0;");
            }
        }

        public void initIds() {
            if (this.mMaxItemId == -1) {
                this.mMaxItemId = initializeMaxItemId(getWritableDatabase());
            }
            if (this.mMaxScreenId == -1) {
                this.mMaxScreenId = initializeMaxScreenId(getWritableDatabase());
            }
        }

        @Override // com.android.launcher3.AutoInstallsLayout.LayoutParserCallback
        public long insertAndCheck(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            return LauncherProvider.dbInsertAndCheck(this, sQLiteDatabase, LauncherSettings.Favorites.TABLE_NAME, null, contentValues);
        }

        public int loadFavorites(SQLiteDatabase sQLiteDatabase, AutoInstallsLayout autoInstallsLayout) {
            ArrayList<Long> arrayList = new ArrayList<>();
            int iLoadLayout = autoInstallsLayout.loadLayout(sQLiteDatabase, arrayList);
            Collections.sort(arrayList);
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Long l10 = arrayList.get(i11);
                i11++;
                contentValues.clear();
                contentValues.put("_id", l10);
                contentValues.put(LauncherSettings.WorkspaceScreens.SCREEN_RANK, Integer.valueOf(i10));
                if (LauncherProvider.dbInsertAndCheck(this, sQLiteDatabase, LauncherSettings.WorkspaceScreens.TABLE_NAME, null, contentValues) < 0) {
                    throw new RuntimeException("Failed initialize screen tablefrom default layout");
                }
                i10++;
            }
            this.mMaxItemId = initializeMaxItemId(sQLiteDatabase);
            this.mMaxScreenId = initializeMaxScreenId(sQLiteDatabase);
            return iLoadLayout;
        }

        public AppWidgetHost newLauncherWidgetHost() {
            return new LauncherAppWidgetHost(this.mContext);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.mMaxItemId = 1L;
            this.mMaxScreenId = 0L;
            addFavoritesTable(sQLiteDatabase, false);
            addWorkspacesTable(sQLiteDatabase, false);
            this.mMaxItemId = initializeMaxItemId(sQLiteDatabase);
            onEmptyDbCreated();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                DbDowngradeHelper.parse(this.mContext.getFileStreamPath(LauncherProvider.DOWNGRADE_SCHEMA_FILE)).onDowngrade(sQLiteDatabase, i10, i11);
            } catch (Exception e10) {
                Log.d(LauncherProvider.TAG, M0.a("Unable to downgrade from: ", i10, " to ", i11, ". Wiping databse."), e10);
                createEmptyDB(sQLiteDatabase);
            }
        }

        public void onEmptyDbCreated() {
            if (this.mWidgetHostResetHandler != null) {
                newLauncherWidgetHost().deleteHost();
                this.mWidgetHostResetHandler.sendEmptyMessage(2);
            }
            Utilities.getPrefs(this.mContext).edit().putBoolean(LauncherProvider.EMPTY_DATABASE_CREATED, true).commit();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            File fileStreamPath = this.mContext.getFileStreamPath(LauncherProvider.DOWNGRADE_SCHEMA_FILE);
            if (!fileStreamPath.exists()) {
                handleOneTimeDataUpgrade(sQLiteDatabase);
            }
            DbDowngradeHelper.updateSchemaFile(fileStreamPath, 27, this.mContext, com.app.hider.master.promax.R.raw.downgrade_schema);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (addIntegerColumn(r4, com.android.launcher3.LauncherSettings.Favorites.RESTORED, 0) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        
            if (addIntegerColumn(r4, com.android.launcher3.LauncherSettings.Favorites.OPTIONS, 0) == false) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r6 = "LauncherProvider"
                r0 = 0
                switch(r5) {
                    case 12: goto La;
                    case 13: goto L10;
                    case 14: goto L20;
                    case 15: goto L35;
                    case 16: goto L3e;
                    case 17: goto L3e;
                    case 18: goto L3e;
                    case 19: goto L41;
                    case 20: goto L48;
                    case 21: goto L50;
                    case 22: goto L57;
                    case 23: goto L60;
                    case 24: goto L60;
                    case 25: goto L60;
                    case 26: goto L9;
                    case 27: goto L9;
                    default: goto L7;
                }
            L7:
                goto L8b
            L9:
                return
            La:
                r3.mMaxScreenId = r0
                r5 = 0
                r3.addWorkspacesTable(r4, r5)
            L10:
                com.android.launcher3.provider.LauncherDbUtils$SQLiteTransaction r5 = new com.android.launcher3.provider.LauncherDbUtils$SQLiteTransaction     // Catch: android.database.SQLException -> L78
                r5.<init>(r4)     // Catch: android.database.SQLException -> L78
                java.lang.String r2 = "ALTER TABLE favorites ADD COLUMN appWidgetProvider TEXT;"
                r4.execSQL(r2)     // Catch: java.lang.Throwable -> L7a
                r5.commit()     // Catch: java.lang.Throwable -> L7a
                r5.close()     // Catch: android.database.SQLException -> L78
            L20:
                com.android.launcher3.provider.LauncherDbUtils$SQLiteTransaction r5 = new com.android.launcher3.provider.LauncherDbUtils$SQLiteTransaction     // Catch: android.database.SQLException -> L64
                r5.<init>(r4)     // Catch: android.database.SQLException -> L64
                java.lang.String r2 = "ALTER TABLE favorites ADD COLUMN modified INTEGER NOT NULL DEFAULT 0;"
                r4.execSQL(r2)     // Catch: java.lang.Throwable -> L66
                java.lang.String r2 = "ALTER TABLE workspaceScreens ADD COLUMN modified INTEGER NOT NULL DEFAULT 0;"
                r4.execSQL(r2)     // Catch: java.lang.Throwable -> L66
                r5.commit()     // Catch: java.lang.Throwable -> L66
                r5.close()     // Catch: android.database.SQLException -> L64
            L35:
                java.lang.String r5 = "restored"
                boolean r5 = r3.addIntegerColumn(r4, r5, r0)
                if (r5 != 0) goto L3e
                goto L8b
            L3e:
                r3.removeOrphanedItems(r4)
            L41:
                boolean r5 = r3.addProfileColumn(r4)
                if (r5 != 0) goto L48
                goto L8b
            L48:
                r5 = 1
                boolean r5 = r3.updateFolderItemsRank(r4, r5)
                if (r5 != 0) goto L50
                goto L8b
            L50:
                boolean r5 = r3.recreateWorkspaceTable(r4)
                if (r5 != 0) goto L57
                goto L8b
            L57:
                java.lang.String r5 = "options"
                boolean r5 = r3.addIntegerColumn(r4, r5, r0)
                if (r5 != 0) goto L60
                goto L8b
            L60:
                r3.convertShortcutsToLauncherActivities(r4)
                return
            L64:
                r5 = move-exception
                goto L70
            L66:
                r0 = move-exception
                r5.close()     // Catch: java.lang.Throwable -> L6b
                goto L6f
            L6b:
                r5 = move-exception
                r0.addSuppressed(r5)     // Catch: android.database.SQLException -> L64
            L6f:
                throw r0     // Catch: android.database.SQLException -> L64
            L70:
                java.lang.String r0 = r5.getMessage()
                android.util.Log.e(r6, r0, r5)
                goto L8b
            L78:
                r5 = move-exception
                goto L84
            L7a:
                r0 = move-exception
                r5.close()     // Catch: java.lang.Throwable -> L7f
                goto L83
            L7f:
                r5 = move-exception
                r0.addSuppressed(r5)     // Catch: android.database.SQLException -> L78
            L83:
                throw r0     // Catch: android.database.SQLException -> L78
            L84:
                java.lang.String r0 = r5.getMessage()
                android.util.Log.e(r6, r0, r5)
            L8b:
                java.lang.String r5 = "Destroying all old data."
                android.util.Log.w(r6, r5)
                r3.createEmptyDB(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherProvider.DatabaseHelper.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        public boolean recreateWorkspaceTable(SQLiteDatabase sQLiteDatabase) {
            try {
                LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(sQLiteDatabase);
                try {
                    Cursor cursorQuery = sQLiteDatabase.query(LauncherSettings.WorkspaceScreens.TABLE_NAME, new String[]{"_id"}, null, null, null, null, LauncherSettings.WorkspaceScreens.SCREEN_RANK);
                    try {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LauncherDbUtils.iterateCursor(cursorQuery, 0, linkedHashSet);
                        ArrayList arrayList = new ArrayList(linkedHashSet);
                        cursorQuery.close();
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS workspaceScreens");
                        addWorkspacesTable(sQLiteDatabase, false);
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("_id", (Long) arrayList.get(i10));
                            contentValues.put(LauncherSettings.WorkspaceScreens.SCREEN_RANK, Integer.valueOf(i10));
                            LauncherProvider.addModifiedTime(contentValues);
                            sQLiteDatabase.insertOrThrow(LauncherSettings.WorkspaceScreens.TABLE_NAME, null, contentValues);
                        }
                        sQLiteTransaction.commit();
                        this.mMaxScreenId = arrayList.isEmpty() ? 0L : ((Long) Collections.max(arrayList)).longValue();
                        sQLiteTransaction.close();
                        return true;
                    } finally {
                        Log.e(LauncherProvider.TAG, e.getMessage(), e);
                        return false;
                    }
                } finally {
                }
            } catch (SQLException e10) {
                Log.e(LauncherProvider.TAG, e10.getMessage(), e10);
                return false;
            }
        }

        @TargetApi(26)
        public void removeGhostWidgets(SQLiteDatabase sQLiteDatabase) {
            int i10;
            AppWidgetHost appWidgetHostNewLauncherWidgetHost = newLauncherWidgetHost();
            try {
                int[] appWidgetIds = appWidgetHostNewLauncherWidgetHost.getAppWidgetIds();
                HashSet hashSet = new HashSet();
                try {
                    Cursor cursorQuery = sQLiteDatabase.query(LauncherSettings.Favorites.TABLE_NAME, new String[]{LauncherSettings.Favorites.APPWIDGET_ID}, "itemType=4", null, null, null, null);
                    while (true) {
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            } else {
                                hashSet.add(Integer.valueOf(cursorQuery.getInt(0)));
                            }
                        } finally {
                        }
                    }
                    cursorQuery.close();
                    for (int i11 : appWidgetIds) {
                        if (!hashSet.contains(Integer.valueOf(i11))) {
                            try {
                                FileLog.d(LauncherProvider.TAG, "Deleting invalid widget " + i11);
                                appWidgetHostNewLauncherWidgetHost.deleteAppWidgetId(i11);
                            } catch (RuntimeException unused) {
                            }
                        }
                    }
                } catch (SQLException e10) {
                    Log.w(LauncherProvider.TAG, "Error getting widgets list", e10);
                }
            } catch (IncompatibleClassChangeError e11) {
                Log.e(LauncherProvider.TAG, "getAppWidgetIds not supported", e11);
            }
        }

        public boolean updateFolderItemsRank(SQLiteDatabase sQLiteDatabase, boolean z10) {
            try {
                LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(sQLiteDatabase);
                if (z10) {
                    try {
                        sQLiteDatabase.execSQL("ALTER TABLE favorites ADD COLUMN rank INTEGER NOT NULL DEFAULT 0;");
                    } finally {
                    }
                }
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT container, MAX(cellX) FROM favorites WHERE container IN (SELECT _id FROM favorites WHERE itemType = ?) GROUP BY container;", new String[]{Integer.toString(2)});
                while (cursorRawQuery.moveToNext()) {
                    sQLiteDatabase.execSQL("UPDATE favorites SET rank=cellX+(cellY*?) WHERE container=? AND cellX IS NOT NULL AND cellY IS NOT NULL;", new Object[]{Long.valueOf(cursorRawQuery.getLong(1) + 1), Long.valueOf(cursorRawQuery.getLong(0))});
                }
                cursorRawQuery.close();
                sQLiteTransaction.commit();
                sQLiteTransaction.close();
                return true;
            } catch (SQLException e10) {
                Log.e(LauncherProvider.TAG, e10.getMessage(), e10);
                return false;
            }
        }

        public DatabaseHelper(Context context, Handler handler, String str) {
            super(context, str, 27);
            this.mMaxItemId = -1L;
            this.mMaxScreenId = -1L;
            this.mContext = context;
            this.mWidgetHostResetHandler = handler;
        }
    }

    public static class SqlArguments {
        public final String[] args;
        public final String table;
        public final String where;

        public SqlArguments(Uri uri, String str, String[] strArr) {
            if (uri.getPathSegments().size() == 1) {
                this.table = uri.getPathSegments().get(0);
                this.where = str;
                this.args = strArr;
            } else {
                if (uri.getPathSegments().size() != 2) {
                    throw new IllegalArgumentException(O.a("Invalid URI: ", uri));
                }
                if (!TextUtils.isEmpty(str)) {
                    throw new UnsupportedOperationException(O.a("WHERE clause not supported: ", uri));
                }
                this.table = uri.getPathSegments().get(0);
                this.where = "_id=" + ContentUris.parseId(uri);
                this.args = null;
            }
        }

        public SqlArguments(Uri uri) {
            if (uri.getPathSegments().size() == 1) {
                this.table = uri.getPathSegments().get(0);
                this.where = null;
                this.args = null;
                return;
            }
            throw new IllegalArgumentException(O.a("Invalid URI: ", uri));
        }
    }
}

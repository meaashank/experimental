package com.android.launcher3.model;

import U6.j;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.Q;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.LauncherProvider;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.PackageInstallerCompat;
import com.android.launcher3.util.GridOccupancy;
import com.android.launcher3.util.LongArrayMap;
import com.prism.commons.utils.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class GridSizeMigrationTask {
    private static final boolean DEBUG = true;
    public static boolean ENABLED = Utilities.ATLEAST_NOUGAT;
    private static final String KEY_MIGRATION_SRC_HOTSEAT_COUNT = "migration_src_hotseat_count";
    private static final String KEY_MIGRATION_SRC_WORKSPACE_SIZE = "migration_src_workspace_size";
    private static final String TAG = "GridSizeMigrationTask";
    private static final float WT_APPLICATION = 0.8f;
    private static final float WT_FOLDER_FACTOR = 0.5f;
    private static final float WT_SHORTCUT = 1.0f;
    private static final float WT_WIDGET_FACTOR = 0.6f;
    private static final float WT_WIDGET_MIN = 2.0f;
    protected final ArrayList<DbEntry> mCarryOver;
    private final Context mContext;
    private final int mDestHotseatSize;
    protected final ArrayList<Long> mEntryToRemove;
    private final InvariantDeviceProfile mIdp;
    private final boolean mShouldRemoveX;
    private final boolean mShouldRemoveY;
    private final int mSrcHotseatSize;
    private final int mSrcX;
    private final int mSrcY;
    private final ContentValues mTempValues;
    private final int mTrgX;
    private final int mTrgY;
    private final ArrayList<ContentProviderOperation> mUpdateOperations;
    private final HashSet<String> mValidPackages;

    public static class DbEntry extends ItemInfo implements Comparable<DbEntry> {
        public float weight;

        public void addToContentValues(ContentValues contentValues) {
            contentValues.put(LauncherSettings.Favorites.SCREEN, Long.valueOf(this.screenId));
            contentValues.put(LauncherSettings.Favorites.CELLX, Integer.valueOf(this.cellX));
            contentValues.put(LauncherSettings.Favorites.CELLY, Integer.valueOf(this.cellY));
            contentValues.put(LauncherSettings.Favorites.SPANX, Integer.valueOf(this.spanX));
            contentValues.put(LauncherSettings.Favorites.SPANY, Integer.valueOf(this.spanY));
        }

        public boolean columnsSame(DbEntry dbEntry) {
            return dbEntry.cellX == this.cellX && dbEntry.cellY == this.cellY && dbEntry.spanX == this.spanX && dbEntry.spanY == this.spanY && dbEntry.screenId == this.screenId;
        }

        public DbEntry copy() {
            DbEntry dbEntry = new DbEntry();
            dbEntry.copyFrom(this);
            dbEntry.weight = this.weight;
            dbEntry.minSpanX = this.minSpanX;
            dbEntry.minSpanY = this.minSpanY;
            return dbEntry;
        }

        @Override // java.lang.Comparable
        public int compareTo(DbEntry dbEntry) {
            if (this.itemType == 4) {
                if (dbEntry.itemType == 4) {
                    return (dbEntry.spanY * dbEntry.spanX) - (this.spanX * this.spanY);
                }
                return -1;
            }
            if (dbEntry.itemType == 4) {
                return 1;
            }
            return Float.compare(dbEntry.weight, this.weight);
        }
    }

    public static class MultiStepMigrationTask {
        private final Context mContext;
        private final HashSet<String> mValidPackages;

        public MultiStepMigrationTask(HashSet<String> hashSet, Context context) {
            this.mValidPackages = hashSet;
            this.mContext = context;
        }

        public boolean migrate(Point point, Point point2) throws Exception {
            boolean z10 = false;
            if (!point2.equals(point)) {
                int i10 = point.x;
                int i11 = point2.x;
                if (i10 < i11) {
                    point.x = i11;
                }
                int i12 = point.y;
                int i13 = point2.y;
                if (i12 < i13) {
                    point.y = i13;
                }
                while (!point2.equals(point)) {
                    Point point3 = new Point(point);
                    int i14 = point2.x;
                    int i15 = point3.x;
                    if (i14 < i15) {
                        point3.x = i15 - 1;
                    }
                    int i16 = point2.y;
                    int i17 = point3.y;
                    if (i16 < i17) {
                        point3.y = i17 - 1;
                    }
                    if (runStepTask(point, point3)) {
                        z10 = true;
                    }
                    point.set(point3.x, point3.y);
                }
            }
            return z10;
        }

        public boolean runStepTask(Point point, Point point2) throws Exception {
            Context context = this.mContext;
            return new GridSizeMigrationTask(context, LauncherAppState.getIDP(context), this.mValidPackages, point, point2).migrateWorkspace();
        }
    }

    public class OptimalPlacementSolution {
        ArrayList<DbEntry> finalPlacedItems;
        private final boolean ignoreMove;
        private final ArrayList<DbEntry> itemsToPlace;
        float lowestMoveCost;
        float lowestWeightLoss;
        private final GridOccupancy occupied;
        private final int startY;

        public OptimalPlacementSolution(GridSizeMigrationTask gridSizeMigrationTask, GridOccupancy gridOccupancy, ArrayList<DbEntry> arrayList, int i10) {
            this(gridOccupancy, arrayList, i10, false);
        }

        public void find() {
            find(0, 0.0f, 0.0f, new ArrayList<>());
        }

        public OptimalPlacementSolution(GridOccupancy gridOccupancy, ArrayList<DbEntry> arrayList, int i10, boolean z10) {
            this.lowestWeightLoss = Float.MAX_VALUE;
            this.lowestMoveCost = Float.MAX_VALUE;
            this.occupied = gridOccupancy;
            this.itemsToPlace = arrayList;
            this.ignoreMove = z10;
            this.startY = i10;
            Collections.sort(arrayList);
        }

        public void find(int i10, float f10, float f11, ArrayList<DbEntry> arrayList) {
            float f12;
            float f13;
            int i11;
            int i12 = i10;
            float f14 = f10;
            float f15 = this.lowestWeightLoss;
            if (f14 >= f15) {
                return;
            }
            if (f14 == f15 && f11 >= this.lowestMoveCost) {
                return;
            }
            if (i12 >= this.itemsToPlace.size()) {
                this.lowestWeightLoss = f14;
                this.lowestMoveCost = f11;
                this.finalPlacedItems = GridSizeMigrationTask.deepCopy(arrayList);
                return;
            }
            DbEntry dbEntry = this.itemsToPlace.get(i12);
            int i13 = dbEntry.cellX;
            int i14 = dbEntry.cellY;
            ArrayList<DbEntry> arrayList2 = new ArrayList<>(arrayList.size() + 1);
            arrayList2.addAll(arrayList);
            arrayList2.add(dbEntry);
            int i15 = dbEntry.spanX;
            if (i15 > 1 || dbEntry.spanY > 1) {
                int i16 = dbEntry.spanY;
                int i17 = this.startY;
                while (i17 < GridSizeMigrationTask.this.mTrgY) {
                    int i18 = 0;
                    while (i18 < GridSizeMigrationTask.this.mTrgX) {
                        if (i18 != i13) {
                            dbEntry.cellX = i18;
                            f12 = f11 + 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != i14) {
                            dbEntry.cellY = i17;
                            f12 += 1.0f;
                        }
                        if (this.ignoreMove) {
                            f12 = f11;
                        }
                        if (this.occupied.isRegionVacant(i18, i17, i15, i16)) {
                            this.occupied.markCells((ItemInfo) dbEntry, true);
                            find(i12 + 1, f14, f12, arrayList2);
                            this.occupied.markCells((ItemInfo) dbEntry, false);
                        }
                        if (i15 > dbEntry.minSpanX && this.occupied.isRegionVacant(i18, i17, i15 - 1, i16)) {
                            dbEntry.spanX--;
                            this.occupied.markCells((ItemInfo) dbEntry, true);
                            find(i12 + 1, f14, f12 + 1.0f, arrayList2);
                            this.occupied.markCells((ItemInfo) dbEntry, false);
                            dbEntry.spanX++;
                        }
                        if (i16 > dbEntry.minSpanY && this.occupied.isRegionVacant(i18, i17, i15, i16 - 1)) {
                            dbEntry.spanY--;
                            this.occupied.markCells((ItemInfo) dbEntry, true);
                            find(i12 + 1, f14, f12 + 1.0f, arrayList2);
                            this.occupied.markCells((ItemInfo) dbEntry, false);
                            dbEntry.spanY++;
                        }
                        if (i16 > dbEntry.minSpanY && i15 > dbEntry.minSpanX && this.occupied.isRegionVacant(i18, i17, i15 - 1, i16 - 1)) {
                            dbEntry.spanX--;
                            dbEntry.spanY--;
                            this.occupied.markCells((ItemInfo) dbEntry, true);
                            find(i10 + 1, f14, f12 + 2.0f, arrayList2);
                            this.occupied.markCells((ItemInfo) dbEntry, false);
                            dbEntry.spanX++;
                            dbEntry.spanY++;
                        }
                        dbEntry.cellX = i13;
                        dbEntry.cellY = i14;
                        i18++;
                        i12 = i10;
                    }
                    i17++;
                    i12 = i10;
                }
                find(i10 + 1, f14 + dbEntry.weight, f11, arrayList);
                return;
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = Integer.MAX_VALUE;
            int i21 = Integer.MAX_VALUE;
            for (int i22 = this.startY; i22 < GridSizeMigrationTask.this.mTrgY; i22++) {
                for (int i23 = 0; i23 < GridSizeMigrationTask.this.mTrgX; i23++) {
                    if (!this.occupied.cells[i23][i22]) {
                        if (this.ignoreMove) {
                            i11 = 0;
                        } else {
                            int i24 = dbEntry.cellX - i23;
                            int i25 = dbEntry.cellY - i22;
                            i11 = (i25 * i25) + (i24 * i24);
                        }
                        if (i11 < i21) {
                            i20 = i22;
                            i21 = i11;
                            i19 = i23;
                        }
                    }
                }
            }
            if (i19 < GridSizeMigrationTask.this.mTrgX && i20 < GridSizeMigrationTask.this.mTrgY) {
                if (i19 != i13) {
                    dbEntry.cellX = i19;
                    f13 = f11 + 1.0f;
                } else {
                    f13 = f11;
                }
                if (i20 != i14) {
                    dbEntry.cellY = i20;
                    f13 += 1.0f;
                }
                if (this.ignoreMove) {
                    f13 = f11;
                }
                this.occupied.markCells((ItemInfo) dbEntry, true);
                int i26 = i12 + 1;
                find(i26, f14, f13, arrayList2);
                this.occupied.markCells((ItemInfo) dbEntry, false);
                dbEntry.cellX = i13;
                dbEntry.cellY = i14;
                if (i26 < this.itemsToPlace.size()) {
                    float f16 = this.itemsToPlace.get(i26).weight;
                    float f17 = dbEntry.weight;
                    if (f16 < f17 || this.ignoreMove) {
                        return;
                    }
                    find(i26, f14 + f17, f11, arrayList);
                    return;
                }
                return;
            }
            while (true) {
                i12++;
                if (i12 >= this.itemsToPlace.size()) {
                    find(this.itemsToPlace.size(), f14 + dbEntry.weight, f11, arrayList);
                    return;
                }
                f14 += this.itemsToPlace.get(i12).weight;
            }
        }
    }

    public GridSizeMigrationTask(Context context, InvariantDeviceProfile invariantDeviceProfile, HashSet<String> hashSet, Point point, Point point2) {
        this.mTempValues = new ContentValues();
        this.mEntryToRemove = new ArrayList<>();
        this.mUpdateOperations = new ArrayList<>();
        this.mCarryOver = new ArrayList<>();
        this.mContext = context;
        this.mValidPackages = hashSet;
        this.mIdp = invariantDeviceProfile;
        int i10 = point.x;
        this.mSrcX = i10;
        int i11 = point.y;
        this.mSrcY = i11;
        int i12 = point2.x;
        this.mTrgX = i12;
        int i13 = point2.y;
        this.mTrgY = i13;
        this.mShouldRemoveX = i12 < i10;
        this.mShouldRemoveY = i13 < i11;
        this.mDestHotseatSize = -1;
        this.mSrcHotseatSize = -1;
    }

    private boolean applyOperations() throws Exception {
        if (!this.mUpdateOperations.isEmpty()) {
            this.mContext.getContentResolver().applyBatch(LauncherProvider.AUTHORITY, this.mUpdateOperations);
        }
        if (!this.mEntryToRemove.isEmpty()) {
            Log.d(TAG, "Removing items: " + TextUtils.join(j.f68738d, this.mEntryToRemove));
            this.mContext.getContentResolver().delete(LauncherSettings.Favorites.CONTENT_URI, Utilities.createDbSelectionQuery("_id", this.mEntryToRemove), null);
        }
        return (this.mUpdateOperations.isEmpty() && this.mEntryToRemove.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<DbEntry> deepCopy(ArrayList<DbEntry> arrayList) {
        ArrayList<DbEntry> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            DbEntry dbEntry = arrayList.get(i10);
            i10++;
            arrayList2.add(dbEntry.copy());
        }
        return arrayList2;
    }

    private int getFolderItemsCount(long j10) {
        Cursor cursorQueryWorkspace = queryWorkspace(new String[]{"_id", "intent"}, Q.a("container = ", j10));
        int i10 = 0;
        while (cursorQueryWorkspace.moveToNext()) {
            try {
                verifyIntent(cursorQueryWorkspace.getString(1));
                i10++;
            } catch (Exception unused) {
                this.mEntryToRemove.add(Long.valueOf(cursorQueryWorkspace.getLong(0)));
            }
        }
        cursorQueryWorkspace.close();
        return i10;
    }

    private static String getPointString(int i10, int i11) {
        return String.format(Locale.ENGLISH, "%d,%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static HashSet<String> getValidPackages(Context context) {
        HashSet<String> hashSet = new HashSet<>();
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(8192);
        I.b(TAG, "getInstalledPackages num: %d", Integer.valueOf(installedPackages.size()));
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().packageName);
        }
        hashSet.addAll(PackageInstallerCompat.getInstance(context).updateAndGetActiveSessionCache().keySet());
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<com.android.launcher3.model.GridSizeMigrationTask.DbEntry> loadHotseatEntries() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.model.GridSizeMigrationTask.loadHotseatEntries():java.util.ArrayList");
    }

    public static void markForMigration(Context context, int i10, int i11, int i12) {
        Utilities.getPrefs(context).edit().putString(KEY_MIGRATION_SRC_WORKSPACE_SIZE, getPointString(i10, i11)).putInt(KEY_MIGRATION_SRC_HOTSEAT_COUNT, i12).apply();
    }

    public static boolean migrateGridIfNeeded(Context context) {
        boolean zMigrateHotseat;
        SharedPreferences prefs = Utilities.getPrefs(context);
        InvariantDeviceProfile idp = LauncherAppState.getIDP(context);
        String pointString = getPointString(idp.numColumns, idp.numRows);
        if (pointString.equals(prefs.getString(KEY_MIGRATION_SRC_WORKSPACE_SIZE, ""))) {
            int i10 = idp.numHotseatIcons;
            if (i10 == prefs.getInt(KEY_MIGRATION_SRC_HOTSEAT_COUNT, i10)) {
                return true;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                HashSet<String> validPackages = getValidPackages(context);
                int i11 = prefs.getInt(KEY_MIGRATION_SRC_HOTSEAT_COUNT, idp.numHotseatIcons);
                zMigrateHotseat = i11 != idp.numHotseatIcons ? new GridSizeMigrationTask(context, LauncherAppState.getIDP(context), validPackages, i11, idp.numHotseatIcons).migrateHotseat() : false;
                if (new MultiStepMigrationTask(validPackages, context).migrate(parsePoint(prefs.getString(KEY_MIGRATION_SRC_WORKSPACE_SIZE, pointString)), new Point(idp.numColumns, idp.numRows))) {
                    zMigrateHotseat = true;
                }
            } catch (Exception e10) {
                Log.e(TAG, "Error during grid migration", e10);
                Log.v(TAG, "Workspace migration completed in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                prefs.edit().putString(KEY_MIGRATION_SRC_WORKSPACE_SIZE, pointString).putInt(KEY_MIGRATION_SRC_HOTSEAT_COUNT, idp.numHotseatIcons).apply();
                return false;
            }
        } finally {
            Log.v(TAG, "Workspace migration completed in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            prefs.edit().putString(KEY_MIGRATION_SRC_WORKSPACE_SIZE, pointString).putInt(KEY_MIGRATION_SRC_HOTSEAT_COUNT, idp.numHotseatIcons).apply();
        }
        if (zMigrateHotseat) {
            Cursor cursorQuery = context.getContentResolver().query(LauncherSettings.Favorites.CONTENT_URI, null, null, null, null);
            boolean zMoveToNext = cursorQuery.moveToNext();
            cursorQuery.close();
            if (!zMoveToNext) {
                throw new Exception("Removed every thing during grid resize");
            }
            Log.v(TAG, "Workspace migration completed in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            prefs.edit().putString(KEY_MIGRATION_SRC_WORKSPACE_SIZE, pointString).putInt(KEY_MIGRATION_SRC_HOTSEAT_COUNT, idp.numHotseatIcons).apply();
        }
        return true;
    }

    private static Point parsePoint(String str) {
        String[] strArrSplit = str.split(",");
        return new Point(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
    }

    public static LongArrayMap<Object> removeBrokenHotseatItems(Context context) throws Exception {
        GridSizeMigrationTask gridSizeMigrationTask = new GridSizeMigrationTask(context, LauncherAppState.getIDP(context), getValidPackages(context), Integer.MAX_VALUE, Integer.MAX_VALUE);
        ArrayList<DbEntry> arrayListLoadHotseatEntries = gridSizeMigrationTask.loadHotseatEntries();
        gridSizeMigrationTask.applyOperations();
        LongArrayMap<Object> longArrayMap = new LongArrayMap<>();
        int size = arrayListLoadHotseatEntries.size();
        int i10 = 0;
        while (i10 < size) {
            DbEntry dbEntry = arrayListLoadHotseatEntries.get(i10);
            i10++;
            DbEntry dbEntry2 = dbEntry;
            longArrayMap.put(dbEntry2.screenId, dbEntry2);
        }
        return longArrayMap;
    }

    private ArrayList<DbEntry> tryRemove(int i10, int i11, int i12, ArrayList<DbEntry> arrayList, float[] fArr) {
        int i13;
        GridOccupancy gridOccupancy = new GridOccupancy(this.mTrgX, this.mTrgY);
        gridOccupancy.markCells(0, 0, this.mTrgX, i12, true);
        int i14 = this.mShouldRemoveX ? i10 : Integer.MAX_VALUE;
        int i15 = this.mShouldRemoveY ? i11 : Integer.MAX_VALUE;
        ArrayList<DbEntry> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size) {
            DbEntry dbEntry = arrayList.get(i16);
            i16++;
            DbEntry dbEntry2 = dbEntry;
            int i17 = dbEntry2.cellX;
            if ((i17 > i14 || dbEntry2.spanX + i17 <= i14) && ((i13 = dbEntry2.cellY) > i15 || dbEntry2.spanY + i13 <= i15)) {
                if (i17 > i14) {
                    dbEntry2.cellX = i17 - 1;
                }
                if (i13 > i15) {
                    dbEntry2.cellY = i13 - 1;
                }
                arrayList2.add(dbEntry2);
                gridOccupancy.markCells((ItemInfo) dbEntry2, true);
            } else {
                arrayList3.add(dbEntry2);
                int i18 = dbEntry2.cellX;
                if (i18 >= i14) {
                    dbEntry2.cellX = i18 - 1;
                }
                int i19 = dbEntry2.cellY;
                if (i19 >= i15) {
                    dbEntry2.cellY = i19 - 1;
                }
            }
        }
        OptimalPlacementSolution optimalPlacementSolution = new OptimalPlacementSolution(gridOccupancy, arrayList3, i12, false);
        optimalPlacementSolution.find();
        arrayList2.addAll(optimalPlacementSolution.finalPlacedItems);
        fArr[0] = optimalPlacementSolution.lowestWeightLoss;
        fArr[1] = optimalPlacementSolution.lowestMoveCost;
        return arrayList2;
    }

    private void verifyIntent(String str) throws Exception {
        Intent uri = Intent.parseUri(str, 0);
        if (uri.getComponent() != null) {
            verifyPackage(uri.getComponent().getPackageName());
        } else if (uri.getPackage() != null) {
            verifyPackage(uri.getPackage());
        }
    }

    private void verifyPackage(String str) throws Exception {
        if (!this.mValidPackages.contains(str)) {
            throw new Exception("Package not available");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.android.launcher3.model.GridSizeMigrationTask.DbEntry> loadWorkspaceEntries(long r19) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.model.GridSizeMigrationTask.loadWorkspaceEntries(long):java.util.ArrayList");
    }

    public boolean migrateHotseat() throws Exception {
        ArrayList<DbEntry> arrayListLoadHotseatEntries = loadHotseatEntries();
        int i10 = this.mDestHotseatSize - 1;
        while (true) {
            int i11 = 0;
            if (arrayListLoadHotseatEntries.size() <= i10) {
                break;
            }
            DbEntry dbEntry = arrayListLoadHotseatEntries.get(arrayListLoadHotseatEntries.size() / 2);
            int size = arrayListLoadHotseatEntries.size();
            while (i11 < size) {
                DbEntry dbEntry2 = arrayListLoadHotseatEntries.get(i11);
                i11++;
                DbEntry dbEntry3 = dbEntry2;
                if (dbEntry3.weight < dbEntry.weight) {
                    dbEntry = dbEntry3;
                }
            }
            this.mEntryToRemove.add(Long.valueOf(dbEntry.f136873id));
            arrayListLoadHotseatEntries.remove(dbEntry);
        }
        int size2 = arrayListLoadHotseatEntries.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            DbEntry dbEntry4 = arrayListLoadHotseatEntries.get(i13);
            i13++;
            DbEntry dbEntry5 = dbEntry4;
            long j10 = i12;
            if (dbEntry5.screenId != j10) {
                dbEntry5.screenId = j10;
                dbEntry5.cellX = i12;
                dbEntry5.cellY = 0;
                update(dbEntry5);
            }
            int i14 = i12 + 1;
            i12 = this.mIdp.isAllAppsButtonRank(i14) ? i12 + 2 : i14;
        }
        return applyOperations();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void migrateScreen(long j10) {
        int i10;
        ArrayList<DbEntry> arrayListLoadWorkspaceEntries = loadWorkspaceEntries(j10);
        float[] fArr = new float[2];
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        float f10 = Float.MAX_VALUE;
        ArrayList<DbEntry> arrayList = null;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        while (true) {
            if (i13 >= this.mSrcX) {
                break;
            }
            int i15 = i14;
            int i16 = this.mSrcY - 1;
            float f12 = f11;
            float f13 = f10;
            ArrayList<DbEntry> arrayList2 = arrayList;
            int i17 = i11;
            while (true) {
                if (i16 < 0) {
                    i10 = i13;
                    break;
                }
                i10 = i13;
                ArrayList<DbEntry> arrayListTryRemove = tryRemove(i10, i16, 0, deepCopy(arrayListLoadWorkspaceEntries), fArr);
                float f14 = fArr[0];
                if (f14 < f12 || (f14 == f12 && fArr[1] < f13)) {
                    float f15 = fArr[1];
                    if (this.mShouldRemoveX) {
                        i17 = i10;
                    }
                    if (this.mShouldRemoveY) {
                        i15 = i16;
                    }
                    f12 = f14;
                    arrayList2 = arrayListTryRemove;
                    f13 = f15;
                }
                if (!this.mShouldRemoveY) {
                    break;
                }
                i16--;
                i13 = i10;
            }
            i14 = i15;
            f11 = f12;
            f10 = f13;
            if (!this.mShouldRemoveX) {
                i11 = i17;
                arrayList = arrayList2;
                break;
            } else {
                i13 = i10 + 1;
                i11 = i17;
                arrayList = arrayList2;
            }
        }
        Log.d(TAG, String.format("Removing row %d, column %d on screen %d", Integer.valueOf(i14), Integer.valueOf(i11), Long.valueOf(j10)));
        LongArrayMap longArrayMap = new LongArrayMap();
        ArrayList<DbEntry> arrayListDeepCopy = deepCopy(arrayListLoadWorkspaceEntries);
        int size = arrayListDeepCopy.size();
        int i18 = 0;
        while (i18 < size) {
            DbEntry dbEntry = arrayListDeepCopy.get(i18);
            i18++;
            DbEntry dbEntry2 = dbEntry;
            longArrayMap.put(dbEntry2.f136873id, dbEntry2);
        }
        int size2 = arrayList.size();
        int i19 = 0;
        while (i19 < size2) {
            DbEntry dbEntry3 = arrayList.get(i19);
            i19++;
            DbEntry dbEntry4 = dbEntry3;
            DbEntry dbEntry5 = (DbEntry) longArrayMap.get(dbEntry4.f136873id);
            longArrayMap.remove(dbEntry4.f136873id);
            if (!dbEntry4.columnsSame(dbEntry5)) {
                update(dbEntry4);
            }
        }
        Iterator it = longArrayMap.iterator();
        while (it.hasNext()) {
            this.mCarryOver.add((DbEntry) it.next());
        }
        if (this.mCarryOver.isEmpty() || f11 != 0.0f) {
            return;
        }
        GridOccupancy gridOccupancy = new GridOccupancy(this.mTrgX, this.mTrgY);
        gridOccupancy.markCells(0, 0, this.mTrgX, 0, true);
        int size3 = arrayList.size();
        int i20 = 0;
        while (i20 < size3) {
            DbEntry dbEntry6 = arrayList.get(i20);
            i20++;
            gridOccupancy.markCells((ItemInfo) dbEntry6, true);
        }
        OptimalPlacementSolution optimalPlacementSolution = new OptimalPlacementSolution(gridOccupancy, deepCopy(this.mCarryOver), 0, true);
        optimalPlacementSolution.find();
        if (optimalPlacementSolution.lowestWeightLoss == 0.0f) {
            ArrayList<DbEntry> arrayList3 = optimalPlacementSolution.finalPlacedItems;
            int size4 = arrayList3.size();
            while (i12 < size4) {
                DbEntry dbEntry7 = arrayList3.get(i12);
                i12++;
                DbEntry dbEntry8 = dbEntry7;
                dbEntry8.screenId = j10;
                update(dbEntry8);
            }
            this.mCarryOver.clear();
        }
    }

    public boolean migrateWorkspace() throws Exception {
        ArrayList<Long> arrayListLoadWorkspaceScreensDb = LauncherModel.loadWorkspaceScreensDb(this.mContext);
        if (arrayListLoadWorkspaceScreensDb.isEmpty()) {
            throw new Exception("Unable to get workspace screens");
        }
        int size = arrayListLoadWorkspaceScreensDb.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayListLoadWorkspaceScreensDb.get(i10);
            i10++;
            long jLongValue = l10.longValue();
            Log.d(TAG, "Migrating " + jLongValue);
            migrateScreen(jLongValue);
        }
        if (!this.mCarryOver.isEmpty()) {
            LongArrayMap longArrayMap = new LongArrayMap();
            ArrayList<DbEntry> arrayList = this.mCarryOver;
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                DbEntry dbEntry = arrayList.get(i11);
                i11++;
                DbEntry dbEntry2 = dbEntry;
                longArrayMap.put(dbEntry2.f136873id, dbEntry2);
            }
            do {
                OptimalPlacementSolution optimalPlacementSolution = new OptimalPlacementSolution(new GridOccupancy(this.mTrgX, this.mTrgY), deepCopy(this.mCarryOver), 0, true);
                optimalPlacementSolution.find();
                if (optimalPlacementSolution.finalPlacedItems.size() <= 0) {
                    throw new Exception("None of the items can be placed on an empty screen");
                }
                long j10 = LauncherSettings.Settings.call(this.mContext.getContentResolver(), LauncherSettings.Settings.METHOD_NEW_SCREEN_ID).getLong("value");
                arrayListLoadWorkspaceScreensDb.add(Long.valueOf(j10));
                ArrayList<DbEntry> arrayList2 = optimalPlacementSolution.finalPlacedItems;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    DbEntry dbEntry3 = arrayList2.get(i12);
                    i12++;
                    DbEntry dbEntry4 = dbEntry3;
                    if (!this.mCarryOver.remove(longArrayMap.get(dbEntry4.f136873id))) {
                        throw new Exception("Unable to find matching items");
                    }
                    dbEntry4.screenId = j10;
                    update(dbEntry4);
                }
            } while (!this.mCarryOver.isEmpty());
            Uri uri = LauncherSettings.WorkspaceScreens.CONTENT_URI;
            this.mUpdateOperations.add(ContentProviderOperation.newDelete(uri).build());
            int size4 = arrayListLoadWorkspaceScreensDb.size();
            for (int i13 = 0; i13 < size4; i13++) {
                ContentValues contentValues = new ContentValues();
                Long l11 = arrayListLoadWorkspaceScreensDb.get(i13);
                l11.getClass();
                contentValues.put("_id", l11);
                contentValues.put(LauncherSettings.WorkspaceScreens.SCREEN_RANK, Integer.valueOf(i13));
                this.mUpdateOperations.add(ContentProviderOperation.newInsert(uri).withValues(contentValues).build());
            }
        }
        return applyOperations();
    }

    public Cursor queryWorkspace(String[] strArr, String str) {
        return this.mContext.getContentResolver().query(LauncherSettings.Favorites.CONTENT_URI, strArr, str, null, null, null);
    }

    public void update(DbEntry dbEntry) {
        this.mTempValues.clear();
        dbEntry.addToContentValues(this.mTempValues);
        this.mUpdateOperations.add(ContentProviderOperation.newUpdate(LauncherSettings.Favorites.getContentUri(dbEntry.f136873id)).withValues(this.mTempValues).build());
    }

    public GridSizeMigrationTask(Context context, InvariantDeviceProfile invariantDeviceProfile, HashSet<String> hashSet, int i10, int i11) {
        this.mTempValues = new ContentValues();
        this.mEntryToRemove = new ArrayList<>();
        this.mUpdateOperations = new ArrayList<>();
        this.mCarryOver = new ArrayList<>();
        this.mContext = context;
        this.mIdp = invariantDeviceProfile;
        this.mValidPackages = hashSet;
        this.mSrcHotseatSize = i10;
        this.mDestHotseatSize = i11;
        this.mTrgY = -1;
        this.mTrgX = -1;
        this.mSrcY = -1;
        this.mSrcX = -1;
        this.mShouldRemoveY = false;
        this.mShouldRemoveX = false;
    }
}

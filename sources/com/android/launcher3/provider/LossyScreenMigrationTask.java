package com.android.launcher3.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.Utilities;
import com.android.launcher3.model.GridSizeMigrationTask;
import com.android.launcher3.util.LongArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LossyScreenMigrationTask extends GridSizeMigrationTask {
    private final SQLiteDatabase mDb;
    private final LongArrayMap<GridSizeMigrationTask.DbEntry> mOriginalItems;
    private final LongArrayMap<GridSizeMigrationTask.DbEntry> mUpdates;

    public LossyScreenMigrationTask(Context context, InvariantDeviceProfile invariantDeviceProfile, SQLiteDatabase sQLiteDatabase) {
        super(context, invariantDeviceProfile, GridSizeMigrationTask.getValidPackages(context), new Point(invariantDeviceProfile.numColumns, invariantDeviceProfile.numRows + 1), new Point(invariantDeviceProfile.numColumns, invariantDeviceProfile.numRows));
        this.mDb = sQLiteDatabase;
        this.mOriginalItems = new LongArrayMap<>();
        this.mUpdates = new LongArrayMap<>();
    }

    @Override // com.android.launcher3.model.GridSizeMigrationTask
    public ArrayList<GridSizeMigrationTask.DbEntry> loadWorkspaceEntries(long j10) {
        ArrayList<GridSizeMigrationTask.DbEntry> arrayListLoadWorkspaceEntries = super.loadWorkspaceEntries(j10);
        int size = arrayListLoadWorkspaceEntries.size();
        int i10 = 0;
        while (i10 < size) {
            GridSizeMigrationTask.DbEntry dbEntry = arrayListLoadWorkspaceEntries.get(i10);
            i10++;
            GridSizeMigrationTask.DbEntry dbEntry2 = dbEntry;
            this.mOriginalItems.put(dbEntry2.f136873id, dbEntry2.copy());
            dbEntry2.cellY++;
            this.mUpdates.put(dbEntry2.f136873id, dbEntry2.copy());
        }
        return arrayListLoadWorkspaceEntries;
    }

    public void migrateScreen0() {
        migrateScreen(0L);
        ContentValues contentValues = new ContentValues();
        for (GridSizeMigrationTask.DbEntry dbEntry : this.mUpdates) {
            GridSizeMigrationTask.DbEntry dbEntry2 = this.mOriginalItems.get(dbEntry.f136873id);
            if (dbEntry2.cellX != dbEntry.cellX || dbEntry2.cellY != dbEntry.cellY || dbEntry2.spanX != dbEntry.spanX || dbEntry2.spanY != dbEntry.spanY) {
                contentValues.clear();
                dbEntry.addToContentValues(contentValues);
                this.mDb.update(LauncherSettings.Favorites.TABLE_NAME, contentValues, "_id = ?", new String[]{Long.toString(dbEntry.f136873id)});
            }
        }
        ArrayList<GridSizeMigrationTask.DbEntry> arrayList = this.mCarryOver;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            GridSizeMigrationTask.DbEntry dbEntry3 = arrayList.get(i10);
            i10++;
            this.mEntryToRemove.add(Long.valueOf(dbEntry3.f136873id));
        }
        if (this.mEntryToRemove.isEmpty()) {
            return;
        }
        this.mDb.delete(LauncherSettings.Favorites.TABLE_NAME, Utilities.createDbSelectionQuery("_id", this.mEntryToRemove), null);
    }

    @Override // com.android.launcher3.model.GridSizeMigrationTask
    public Cursor queryWorkspace(String[] strArr, String str) {
        return this.mDb.query(LauncherSettings.Favorites.TABLE_NAME, strArr, str, null, null, null, null);
    }

    @Override // com.android.launcher3.model.GridSizeMigrationTask
    public void update(GridSizeMigrationTask.DbEntry dbEntry) {
        this.mUpdates.put(dbEntry.f136873id, dbEntry.copy());
    }
}

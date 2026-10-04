package com.android.launcher3.model;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherActivityInfo;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import com.android.launcher3.AppInfo;
import com.android.launcher3.IconCache;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.graphics.BitmapInfo;
import com.android.launcher3.graphics.LauncherIcons;
import com.android.launcher3.logging.FileLog;
import com.android.launcher3.util.ContentWriter;
import com.android.launcher3.util.GridOccupancy;
import com.android.launcher3.util.LongArrayMap;
import com.prism.commons.utils.I;
import java.net.URISyntaxException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LoaderCursor extends CursorWrapper {
    private static final String TAG = "LoaderCursor";
    public final LongSparseArray<UserHandle> allUsers;
    private final int cellXIndex;
    private final int cellYIndex;
    public long container;
    private final int containerIndex;
    private final int iconIndex;
    private final int iconPackageIndex;
    private final int iconResourceIndex;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f136929id;
    private final int idIndex;
    private final int intentIndex;
    public int itemType;
    private final int itemTypeIndex;
    private final ArrayList<Long> itemsToRemove;
    private final Context mContext;
    private final InvariantDeviceProfile mIDP;
    private final IconCache mIconCache;
    private final UserManagerCompat mUserManager;
    private final LongArrayMap<GridOccupancy> occupied;
    private final int profileIdIndex;
    public int restoreFlag;
    private final int restoredIndex;
    private final ArrayList<Long> restoredRows;
    private final int screenIndex;
    public long serialNumber;
    public final int titleIndex;
    public UserHandle user;

    public LoaderCursor(Cursor cursor, LauncherAppState launcherAppState) {
        super(cursor);
        this.allUsers = new LongSparseArray<>();
        this.itemsToRemove = new ArrayList<>();
        this.restoredRows = new ArrayList<>();
        this.occupied = new LongArrayMap<>();
        Context context = launcherAppState.getContext();
        this.mContext = context;
        this.mIconCache = launcherAppState.getIconCache();
        this.mIDP = launcherAppState.getInvariantDeviceProfile();
        this.mUserManager = UserManagerCompat.getInstance(context);
        this.iconIndex = getColumnIndexOrThrow("icon");
        this.iconPackageIndex = getColumnIndexOrThrow(LauncherSettings.BaseLauncherColumns.ICON_PACKAGE);
        this.iconResourceIndex = getColumnIndexOrThrow(LauncherSettings.BaseLauncherColumns.ICON_RESOURCE);
        this.titleIndex = getColumnIndexOrThrow("title");
        this.idIndex = getColumnIndexOrThrow("_id");
        this.containerIndex = getColumnIndexOrThrow(LauncherSettings.Favorites.CONTAINER);
        this.itemTypeIndex = getColumnIndexOrThrow(LauncherSettings.BaseLauncherColumns.ITEM_TYPE);
        this.screenIndex = getColumnIndexOrThrow(LauncherSettings.Favorites.SCREEN);
        this.cellXIndex = getColumnIndexOrThrow(LauncherSettings.Favorites.CELLX);
        this.cellYIndex = getColumnIndexOrThrow(LauncherSettings.Favorites.CELLY);
        this.profileIdIndex = getColumnIndexOrThrow(LauncherSettings.Favorites.PROFILE_ID);
        this.restoredIndex = getColumnIndexOrThrow(LauncherSettings.Favorites.RESTORED);
        this.intentIndex = getColumnIndexOrThrow("intent");
    }

    public void applyCommonProperties(ItemInfo itemInfo) {
        itemInfo.f136873id = this.f136929id;
        itemInfo.container = this.container;
        itemInfo.screenId = getInt(this.screenIndex);
        itemInfo.cellX = getInt(this.cellXIndex);
        itemInfo.cellY = getInt(this.cellYIndex);
    }

    public void checkAndAddItem(ItemInfo itemInfo, BgDataModel bgDataModel) {
        if (checkItemPlacement(itemInfo, bgDataModel.workspaceScreens)) {
            bgDataModel.addItem(this.mContext, itemInfo, false);
        } else {
            markDeleted("Item position overlap");
        }
    }

    public boolean checkItemPlacement(ItemInfo itemInfo, ArrayList<Long> arrayList) {
        int i10;
        String str;
        long j10 = itemInfo.screenId;
        long j11 = itemInfo.container;
        if (j11 == -101) {
            if (this.mIDP.isAllAppsButtonRank((int) j10)) {
                Log.e(TAG, "Error loading shortcut into hotseat " + itemInfo + " into position (" + itemInfo.screenId + com.prism.gaia.server.accounts.b.f166434b0 + itemInfo.cellX + "," + itemInfo.cellY + ") occupied by all apps");
                return false;
            }
            GridOccupancy gridOccupancy = this.occupied.get(-101L);
            long j12 = itemInfo.screenId;
            int i11 = this.mIDP.numHotseatIcons;
            if (j12 >= i11) {
                Log.e(TAG, "Error loading shortcut " + itemInfo + " into hotseat position " + itemInfo.screenId + ", position out of bounds: (0 to " + (this.mIDP.numHotseatIcons - 1) + ")");
                return false;
            }
            if (gridOccupancy == null) {
                GridOccupancy gridOccupancy2 = new GridOccupancy(i11, 1);
                gridOccupancy2.cells[(int) itemInfo.screenId][0] = true;
                this.occupied.put(-101L, gridOccupancy2);
                return true;
            }
            boolean[] zArr = gridOccupancy.cells[(int) j12];
            if (!zArr[0]) {
                zArr[0] = true;
                return true;
            }
            Log.e(TAG, "Error loading shortcut into hotseat " + itemInfo + " into position (" + itemInfo.screenId + com.prism.gaia.server.accounts.b.f166434b0 + itemInfo.cellX + "," + itemInfo.cellY + ") already occupied");
            return false;
        }
        if (j11 != -100) {
            return true;
        }
        if (!arrayList.contains(Long.valueOf(j10))) {
            I.g(TAG, "shortcut(%s) got error screenId: %d", itemInfo.getPackageNameInComponent(), Long.valueOf(itemInfo.screenId));
            return false;
        }
        InvariantDeviceProfile invariantDeviceProfile = this.mIDP;
        int i12 = invariantDeviceProfile.numColumns;
        int i13 = invariantDeviceProfile.numRows;
        if ((itemInfo.container == -100 && itemInfo.cellX < 0) || (i10 = itemInfo.cellY) < 0 || itemInfo.cellX + itemInfo.spanX > i12 || i10 + itemInfo.spanY > i13) {
            StringBuilder sb2 = new StringBuilder("Error loading shortcut ");
            sb2.append(itemInfo);
            sb2.append(" into cell (");
            sb2.append(j10);
            sb2.append(com.prism.gaia.download.a.f164606q);
            sb2.append(itemInfo.screenId);
            sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
            sb2.append(itemInfo.cellX);
            sb2.append(",");
            androidx.viewpager.widget.a.a(sb2, itemInfo.cellY, ") out of screen bounds ( ", i12, "x");
            sb2.append(i13);
            sb2.append(")");
            Log.e(TAG, sb2.toString());
            return false;
        }
        if (this.occupied.containsKey(itemInfo.screenId)) {
            str = TAG;
        } else {
            int i14 = i12 + 1;
            GridOccupancy gridOccupancy3 = new GridOccupancy(i14, i13 + 1);
            if (itemInfo.screenId == 0) {
                gridOccupancy3.markCells(0, 0, i14, 1, false);
            }
            LongArrayMap<GridOccupancy> longArrayMap = this.occupied;
            str = TAG;
            longArrayMap.put(itemInfo.screenId, gridOccupancy3);
        }
        GridOccupancy gridOccupancy4 = this.occupied.get(itemInfo.screenId);
        if (gridOccupancy4.isRegionVacant(itemInfo.cellX, itemInfo.cellY, itemInfo.spanX, itemInfo.spanY)) {
            gridOccupancy4.markCells(itemInfo, true);
            return true;
        }
        Log.e(str, "Error loading shortcut " + itemInfo + " into cell (" + j10 + com.prism.gaia.download.a.f164606q + itemInfo.screenId + com.prism.gaia.server.accounts.b.f166434b0 + itemInfo.cellX + "," + itemInfo.cellX + "," + itemInfo.spanX + "," + itemInfo.spanY + ") already occupied");
        return false;
    }

    public boolean commitDeleted() {
        if (this.itemsToRemove.size() <= 0) {
            return false;
        }
        this.mContext.getContentResolver().delete(LauncherSettings.Favorites.CONTENT_URI, Utilities.createDbSelectionQuery("_id", this.itemsToRemove), null);
        return true;
    }

    public void commitRestoredItems() {
        if (this.restoredRows.size() > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(LauncherSettings.Favorites.RESTORED, (Integer) 0);
            this.mContext.getContentResolver().update(LauncherSettings.Favorites.CONTENT_URI, contentValues, Utilities.createDbSelectionQuery("_id", this.restoredRows), null);
        }
    }

    public ShortcutInfo getAppShortcutInfo(Intent intent, boolean z10, boolean z11) {
        if (this.user == null) {
            Log.d(TAG, "Null user found in getShortcutInfo");
            return null;
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            Log.d(TAG, "Missing component found in getShortcutInfo");
            return null;
        }
        Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(component);
        LauncherActivityInfo launcherActivityInfoResolveActivity = LauncherAppsCompat.getInstance(this.mContext).resolveActivity(intent2, this.user);
        if (launcherActivityInfoResolveActivity == null && !z10) {
            Log.d(TAG, "Missing activity found in getShortcutInfo: " + component);
            return null;
        }
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        shortcutInfo.itemType = 0;
        shortcutInfo.user = this.user;
        shortcutInfo.intent = intent2;
        this.mIconCache.getTitleAndIcon(shortcutInfo, launcherActivityInfoResolveActivity, z11);
        if (this.mIconCache.isDefaultIcon(shortcutInfo.iconBitmap, this.user)) {
            loadIcon(shortcutInfo);
        }
        if (launcherActivityInfoResolveActivity != null) {
            AppInfo.updateRuntimeFlagsForActivityTarget(shortcutInfo, launcherActivityInfoResolveActivity);
        }
        if (TextUtils.isEmpty(shortcutInfo.title)) {
            shortcutInfo.title = getTitle();
        }
        if (shortcutInfo.title == null) {
            shortcutInfo.title = component.getClassName();
        }
        shortcutInfo.contentDescription = this.mUserManager.getBadgedLabelForUser(shortcutInfo.title, shortcutInfo.user);
        return shortcutInfo;
    }

    public ShortcutInfo getRestoredItemInfo(Intent intent) {
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        shortcutInfo.user = this.user;
        shortcutInfo.intent = intent;
        if (!loadIcon(shortcutInfo)) {
            this.mIconCache.getTitleAndIcon(shortcutInfo, false);
        }
        if (hasRestoreFlag(1)) {
            String title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                shortcutInfo.title = Utilities.trim(title);
            }
        } else {
            if (!hasRestoreFlag(2)) {
                throw new InvalidParameterException("Invalid restoreType " + this.restoreFlag);
            }
            if (TextUtils.isEmpty(shortcutInfo.title)) {
                shortcutInfo.title = getTitle();
            }
        }
        shortcutInfo.contentDescription = this.mUserManager.getBadgedLabelForUser(shortcutInfo.title, shortcutInfo.user);
        shortcutInfo.itemType = this.itemType;
        shortcutInfo.status = this.restoreFlag;
        return shortcutInfo;
    }

    public String getTitle() {
        String string = getString(this.titleIndex);
        return TextUtils.isEmpty(string) ? "" : Utilities.trim(string);
    }

    public boolean hasRestoreFlag(int i10) {
        return (i10 & this.restoreFlag) != 0;
    }

    public boolean isOnWorkspaceOrHotseat() {
        long j10 = this.container;
        return j10 == -100 || j10 == -101;
    }

    public boolean loadIcon(ShortcutInfo shortcutInfo) {
        if (this.itemType == 1) {
            String string = getString(this.iconPackageIndex);
            String string2 = getString(this.iconResourceIndex);
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
                Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                shortcutInfo.iconResource = shortcutIconResource;
                shortcutIconResource.packageName = string;
                shortcutIconResource.resourceName = string2;
                LauncherIcons launcherIconsObtain = LauncherIcons.obtain(this.mContext);
                BitmapInfo bitmapInfoCreateIconBitmap = launcherIconsObtain.createIconBitmap(shortcutInfo.iconResource);
                launcherIconsObtain.recycle();
                if (bitmapInfoCreateIconBitmap != null) {
                    bitmapInfoCreateIconBitmap.applyTo(shortcutInfo);
                    return true;
                }
            }
        }
        byte[] blob = getBlob(this.iconIndex);
        try {
            LauncherIcons launcherIconsObtain2 = LauncherIcons.obtain(this.mContext);
            try {
                launcherIconsObtain2.createIconBitmap(BitmapFactory.decodeByteArray(blob, 0, blob.length)).applyTo(shortcutInfo);
                launcherIconsObtain2.close();
                return true;
            } finally {
            }
        } catch (Exception e10) {
            Log.e(TAG, "Failed to load icon for info " + shortcutInfo, e10);
            return false;
        }
    }

    public ShortcutInfo loadSimpleShortcut() {
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        shortcutInfo.user = this.user;
        shortcutInfo.itemType = this.itemType;
        shortcutInfo.title = getTitle();
        if (!loadIcon(shortcutInfo)) {
            this.mIconCache.getDefaultIcon(shortcutInfo.user).applyTo(shortcutInfo);
        }
        return shortcutInfo;
    }

    public void markDeleted(String str) {
        FileLog.e(TAG, str);
        this.itemsToRemove.add(Long.valueOf(this.f136929id));
    }

    public void markRestored() {
        if (this.restoreFlag != 0) {
            this.restoredRows.add(Long.valueOf(this.f136929id));
            this.restoreFlag = 0;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public boolean moveToNext() {
        boolean zMoveToNext = super.moveToNext();
        if (zMoveToNext) {
            this.itemType = getInt(this.itemTypeIndex);
            this.container = getInt(this.containerIndex);
            this.f136929id = getLong(this.idIndex);
            long j10 = getInt(this.profileIdIndex);
            this.serialNumber = j10;
            this.user = this.allUsers.get(j10);
            this.restoreFlag = getInt(this.restoredIndex);
        }
        return zMoveToNext;
    }

    public Intent parseIntent() {
        String string = getString(this.intentIndex);
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return Intent.parseUri(string, 0);
        } catch (URISyntaxException unused) {
            Log.e(TAG, "Error parsing Intent");
            return null;
        }
    }

    public ContentWriter updater() {
        return new ContentWriter(this.mContext, new ContentWriter.CommitParams("_id= ?", new String[]{Long.toString(this.f136929id)}));
    }
}

package com.android.launcher3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Xml;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.Scopes;
import e.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.xmlpull.v1.XmlPullParserException;
import q8.C5443b;

/* JADX INFO: loaded from: classes2.dex */
public class InvariantDeviceProfile {
    private static float DEFAULT_ICON_SIZE_DP = 60.0f;
    private static final float ICON_SIZE_DEFINED_IN_APP_DP = 48.0f;
    private static float KNEARESTNEIGHBOR = 3.0f;
    private static final String TAG = "InvariantDeviceProfile";
    private static float WEIGHT_EFFICIENT = 100000.0f;
    private static float WEIGHT_POWER = 5.0f;
    int defaultLayoutId;
    public Point defaultWallpaperSize;
    int demoModeLayoutId;
    public int fillResIconDpi;
    public int iconBitmapSize;
    public float iconSize;
    public float iconTextSize;
    public float landscapeIconSize;
    public DeviceProfile landscapeProfile;
    float minHeightDps;
    float minWidthDps;
    String name;
    public int numColumns;
    public int numFolderColumns;
    public int numFolderRows;
    public int numHotseatIcons;
    public int numRows;
    public DeviceProfile portraitProfile;

    @f0
    public InvariantDeviceProfile() {
    }

    private void add(InvariantDeviceProfile invariantDeviceProfile) {
        this.iconSize += invariantDeviceProfile.iconSize;
        this.landscapeIconSize += invariantDeviceProfile.landscapeIconSize;
        this.iconTextSize += invariantDeviceProfile.iconTextSize;
    }

    private void applyPartnerDeviceProfileOverrides(Context context, DisplayMetrics displayMetrics) {
        Partner partner = Partner.get(context.getPackageManager());
        if (partner != null) {
            partner.applyInvariantDeviceProfileOverrides(this, displayMetrics);
        }
    }

    private int getLauncherIconDensity(int i10) {
        int[] iArr = {120, 160, 213, 240, LauncherAnimUtils.ALL_APPS_TRANSITION_MS, 480, 640};
        int i11 = 640;
        for (int i12 = 6; i12 >= 0; i12--) {
            int i13 = iArr[i12];
            if ((i13 * ICON_SIZE_DEFINED_IN_APP_DP) / 160.0f >= i10) {
                i11 = i13;
            }
        }
        return i11;
    }

    private void init(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getCurrentSizeRange(point, point2);
        this.minWidthDps = Utilities.dpiFromPx(Math.min(point.x, point.y), displayMetrics);
        float fDpiFromPx = Utilities.dpiFromPx(Math.min(point2.x, point2.y), displayMetrics);
        this.minHeightDps = fDpiFromPx;
        ArrayList<InvariantDeviceProfile> arrayListFindClosestDeviceProfiles = findClosestDeviceProfiles(this.minWidthDps, fDpiFromPx, getPredefinedDeviceProfiles(context));
        InvariantDeviceProfile invariantDeviceProfileInvDistWeightedInterpolate = invDistWeightedInterpolate(this.minWidthDps, this.minHeightDps, arrayListFindClosestDeviceProfiles);
        InvariantDeviceProfile invariantDeviceProfile = arrayListFindClosestDeviceProfiles.get(0);
        Log.d(TAG, "minWidthDps: " + this.minWidthDps + " minHeightDps:" + this.minHeightDps + " closestProfile:" + invariantDeviceProfile.name + " interpolatedDeviceProfileOut:" + invariantDeviceProfileInvDistWeightedInterpolate.name);
        this.numRows = invariantDeviceProfile.numRows;
        this.numColumns = invariantDeviceProfile.numColumns;
        this.numHotseatIcons = invariantDeviceProfile.numHotseatIcons;
        this.defaultLayoutId = invariantDeviceProfile.defaultLayoutId;
        this.demoModeLayoutId = invariantDeviceProfile.demoModeLayoutId;
        this.numFolderRows = invariantDeviceProfile.numFolderRows;
        this.numFolderColumns = invariantDeviceProfile.numFolderColumns;
        float f10 = invariantDeviceProfileInvDistWeightedInterpolate.iconSize;
        this.iconSize = f10;
        this.landscapeIconSize = invariantDeviceProfileInvDistWeightedInterpolate.landscapeIconSize;
        int iPxFromDp = Utilities.pxFromDp(f10, displayMetrics);
        this.iconBitmapSize = iPxFromDp;
        this.iconTextSize = invariantDeviceProfileInvDistWeightedInterpolate.iconTextSize;
        this.fillResIconDpi = getLauncherIconDensity(iPxFromDp);
        applyPartnerDeviceProfileOverrides(context, displayMetrics);
        Point point3 = new Point();
        defaultDisplay.getRealSize(point3);
        int iMin = Math.min(point3.x, point3.y);
        int iMax = Math.max(point3.x, point3.y);
        this.landscapeProfile = new DeviceProfile(context, this, point, point2, iMax, iMin, true, false);
        this.portraitProfile = new DeviceProfile(context, this, point, point2, iMin, iMax, false, false);
        if (context.getResources().getConfiguration().smallestScreenWidthDp >= 720) {
            this.defaultWallpaperSize = new Point((int) (iMax * wallpaperTravelToScreenWidthRatio(iMax, iMin)), iMax);
        } else {
            this.defaultWallpaperSize = new Point(Math.max(iMin * 2, iMax), iMax);
        }
    }

    private InvariantDeviceProfile multiply(float f10) {
        this.iconSize *= f10;
        this.landscapeIconSize *= f10;
        this.iconTextSize *= f10;
        return this;
    }

    private static float wallpaperTravelToScreenWidthRatio(int i10, int i11) {
        return ((i10 / i11) * 0.30769226f) + 1.0076923f;
    }

    private float weight(float f10, float f11, float f12, float f13, float f14) {
        float fDist = dist(f10, f11, f12, f13);
        if (Float.compare(fDist, 0.0f) == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return (float) (((double) WEIGHT_EFFICIENT) / Math.pow(fDist, f14));
    }

    public float dist(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public ArrayList<InvariantDeviceProfile> findClosestDeviceProfiles(final float f10, final float f11, ArrayList<InvariantDeviceProfile> arrayList) {
        Collections.sort(arrayList, new Comparator<InvariantDeviceProfile>() { // from class: com.android.launcher3.InvariantDeviceProfile.1
            @Override // java.util.Comparator
            public int compare(InvariantDeviceProfile invariantDeviceProfile, InvariantDeviceProfile invariantDeviceProfile2) {
                return Float.compare(InvariantDeviceProfile.this.dist(f10, f11, invariantDeviceProfile.minWidthDps, invariantDeviceProfile.minHeightDps), InvariantDeviceProfile.this.dist(f10, f11, invariantDeviceProfile2.minWidthDps, invariantDeviceProfile2.minHeightDps));
            }
        });
        return arrayList;
    }

    public int getAllAppsButtonRank() {
        return this.numHotseatIcons / 2;
    }

    public DeviceProfile getDeviceProfile(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? this.landscapeProfile : this.portraitProfile;
    }

    public ArrayList<InvariantDeviceProfile> getPredefinedDeviceProfiles(Context context) {
        ArrayList<InvariantDeviceProfile> arrayList = new ArrayList<>();
        try {
            XmlResourceParser xml = context.getResources().getXml(com.app.hider.master.promax.R.xml.device_profiles);
            try {
                int depth = xml.getDepth();
                while (true) {
                    int next = xml.next();
                    if (next == 3 && xml.getDepth() <= depth) {
                        break;
                    }
                    if (next == 1) {
                        break;
                    }
                    if (next == 2 && Scopes.PROFILE.equals(xml.getName())) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xml), R.styleable.InvariantDeviceProfile);
                        int i10 = typedArrayObtainStyledAttributes.getInt(12, 0);
                        int i11 = typedArrayObtainStyledAttributes.getInt(8, 0);
                        float f10 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
                        arrayList.add(new InvariantDeviceProfile(typedArrayObtainStyledAttributes.getString(7), typedArrayObtainStyledAttributes.getFloat(6, 0.0f), typedArrayObtainStyledAttributes.getFloat(5, 0.0f), i10, i11, typedArrayObtainStyledAttributes.getInt(10, i10), typedArrayObtainStyledAttributes.getInt(9, i11), f10, typedArrayObtainStyledAttributes.getFloat(4, f10), typedArrayObtainStyledAttributes.getFloat(3, 0.0f), typedArrayObtainStyledAttributes.getInt(11, i11), typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0)));
                        typedArrayObtainStyledAttributes.recycle();
                    }
                }
                xml.close();
                return arrayList;
            } finally {
            }
        } catch (IOException | XmlPullParserException e10) {
            throw new RuntimeException(e10);
        }
    }

    public InvariantDeviceProfile invDistWeightedInterpolate(float f10, float f11, ArrayList<InvariantDeviceProfile> arrayList) {
        int i10 = 0;
        InvariantDeviceProfile invariantDeviceProfile = arrayList.get(0);
        float f12 = 0.0f;
        if (dist(f10, f11, invariantDeviceProfile.minWidthDps, invariantDeviceProfile.minHeightDps) == 0.0f) {
            return invariantDeviceProfile;
        }
        InvariantDeviceProfile invariantDeviceProfile2 = new InvariantDeviceProfile();
        while (i10 < arrayList.size() && i10 < KNEARESTNEIGHBOR) {
            InvariantDeviceProfile invariantDeviceProfile3 = new InvariantDeviceProfile(arrayList.get(i10));
            float f13 = f10;
            float fWeight = weight(f13, f11, invariantDeviceProfile3.minWidthDps, invariantDeviceProfile3.minHeightDps, WEIGHT_POWER);
            f12 += fWeight;
            invariantDeviceProfile3.multiply(fWeight);
            invariantDeviceProfile2.add(invariantDeviceProfile3);
            i10++;
            f10 = f13;
        }
        invariantDeviceProfile2.multiply(1.0f / f12);
        return invariantDeviceProfile2;
    }

    public boolean isAllAppsButtonRank(int i10) {
        return i10 == getAllAppsButtonRank();
    }

    public void reinitialize(Context context) {
        init(context);
    }

    private InvariantDeviceProfile(InvariantDeviceProfile invariantDeviceProfile) {
        this(invariantDeviceProfile.name, invariantDeviceProfile.minWidthDps, invariantDeviceProfile.minHeightDps, invariantDeviceProfile.numRows, invariantDeviceProfile.numColumns, invariantDeviceProfile.numFolderRows, invariantDeviceProfile.numFolderColumns, invariantDeviceProfile.iconSize, invariantDeviceProfile.landscapeIconSize, invariantDeviceProfile.iconTextSize, invariantDeviceProfile.numHotseatIcons, invariantDeviceProfile.defaultLayoutId, invariantDeviceProfile.demoModeLayoutId);
    }

    private InvariantDeviceProfile(String str, float f10, float f11, int i10, int i11, int i12, int i13, float f12, float f13, float f14, int i14, int i15, int i16) {
        this.name = str;
        this.minWidthDps = f10;
        this.minHeightDps = f11;
        this.numRows = i10;
        this.numColumns = i11;
        this.numFolderRows = i12;
        this.numFolderColumns = i13;
        this.iconSize = f12;
        this.landscapeIconSize = f13;
        this.iconTextSize = f14;
        this.numHotseatIcons = i14;
        this.defaultLayoutId = i15;
        this.demoModeLayoutId = i16;
    }

    @TargetApi(23)
    public InvariantDeviceProfile(Context context) {
        init(context);
    }
}

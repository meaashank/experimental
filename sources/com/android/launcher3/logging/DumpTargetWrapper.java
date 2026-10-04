package com.android.launcher3.logging;

import android.os.Process;
import android.support.v4.media.d;
import android.support.v4.media.f;
import android.text.TextUtils;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.model.nano.LauncherDumpProto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DumpTargetWrapper {
    ArrayList<DumpTargetWrapper> children;
    LauncherDumpProto.DumpTarget node;

    public DumpTargetWrapper() {
        this.children = new ArrayList<>();
    }

    public static String getDumpTargetStr(LauncherDumpProto.DumpTarget dumpTarget) {
        if (dumpTarget == null) {
            return "";
        }
        int i10 = dumpTarget.type;
        if (i10 == 1) {
            return getItemStr(dumpTarget);
        }
        if (i10 != 2) {
            return "UNKNOWN TARGET TYPE";
        }
        String fieldName = LoggerUtils.getFieldName(dumpTarget.containerType, LauncherDumpProto.ContainerType.class);
        int i11 = dumpTarget.containerType;
        if (i11 == 1) {
            StringBuilder sbA = f.a(fieldName, " id=");
            sbA.append(dumpTarget.pageId);
            return sbA.toString();
        }
        if (i11 != 3) {
            return fieldName;
        }
        StringBuilder sbA2 = f.a(fieldName, " grid(");
        sbA2.append(dumpTarget.gridX);
        sbA2.append(",");
        return d.a(sbA2, dumpTarget.gridY, ")");
    }

    private static String getItemStr(LauncherDumpProto.DumpTarget dumpTarget) {
        String fieldName = LoggerUtils.getFieldName(dumpTarget.itemType, LauncherDumpProto.ItemType.class);
        if (!TextUtils.isEmpty(dumpTarget.packageName)) {
            StringBuilder sbA = f.a(fieldName, ", package=");
            sbA.append(dumpTarget.packageName);
            fieldName = sbA.toString();
        }
        if (!TextUtils.isEmpty(dumpTarget.component)) {
            StringBuilder sbA2 = f.a(fieldName, ", component=");
            sbA2.append(dumpTarget.component);
            fieldName = sbA2.toString();
        }
        StringBuilder sbA3 = f.a(fieldName, ", grid(");
        sbA3.append(dumpTarget.gridX);
        sbA3.append(",");
        sbA3.append(dumpTarget.gridY);
        sbA3.append("), span(");
        sbA3.append(dumpTarget.spanX);
        sbA3.append(",");
        sbA3.append(dumpTarget.spanY);
        sbA3.append("), pageIdx=");
        sbA3.append(dumpTarget.pageId);
        sbA3.append(" user=");
        sbA3.append(dumpTarget.userType);
        return sbA3.toString();
    }

    public void add(DumpTargetWrapper dumpTargetWrapper) {
        this.children.add(dumpTargetWrapper);
    }

    public LauncherDumpProto.DumpTarget getDumpTarget() {
        return this.node;
    }

    public List<LauncherDumpProto.DumpTarget> getFlattenedList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.node);
        if (!this.children.isEmpty()) {
            ArrayList<DumpTargetWrapper> arrayList2 = this.children;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                DumpTargetWrapper dumpTargetWrapper = arrayList2.get(i10);
                i10++;
                arrayList.addAll(dumpTargetWrapper.getFlattenedList());
            }
            arrayList.add(this.node);
        }
        return arrayList;
    }

    public LauncherDumpProto.DumpTarget newContainerTarget(int i10, int i11) {
        LauncherDumpProto.DumpTarget dumpTarget = new LauncherDumpProto.DumpTarget();
        dumpTarget.type = 2;
        dumpTarget.containerType = i10;
        dumpTarget.pageId = i11;
        return dumpTarget;
    }

    public LauncherDumpProto.DumpTarget newItemTarget(ItemInfo itemInfo) {
        LauncherDumpProto.DumpTarget dumpTarget = new LauncherDumpProto.DumpTarget();
        dumpTarget.type = 1;
        int i10 = itemInfo.itemType;
        if (i10 == 0) {
            dumpTarget.itemType = 1;
            return dumpTarget;
        }
        if (i10 == 1) {
            dumpTarget.itemType = 0;
            return dumpTarget;
        }
        if (i10 == 4) {
            dumpTarget.itemType = 2;
            return dumpTarget;
        }
        if (i10 != 6) {
            return dumpTarget;
        }
        dumpTarget.itemType = 3;
        return dumpTarget;
    }

    public LauncherDumpProto.DumpTarget writeToDumpTarget(ItemInfo itemInfo) {
        this.node.component = itemInfo.getTargetComponent() == null ? "" : itemInfo.getTargetComponent().flattenToString();
        this.node.packageName = itemInfo.getTargetComponent() != null ? itemInfo.getTargetComponent().getPackageName() : "";
        if (itemInfo instanceof LauncherAppWidgetInfo) {
            LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) itemInfo;
            this.node.component = launcherAppWidgetInfo.providerName.flattenToString();
            this.node.packageName = launcherAppWidgetInfo.providerName.getPackageName();
        }
        LauncherDumpProto.DumpTarget dumpTarget = this.node;
        dumpTarget.gridX = itemInfo.cellX;
        dumpTarget.gridY = itemInfo.cellY;
        dumpTarget.spanX = itemInfo.spanX;
        dumpTarget.spanY = itemInfo.spanY;
        dumpTarget.userType = !itemInfo.user.equals(Process.myUserHandle()) ? 1 : 0;
        return this.node;
    }

    public DumpTargetWrapper(int i10, int i11) {
        this();
        this.node = newContainerTarget(i10, i11);
    }

    public DumpTargetWrapper(ItemInfo itemInfo) {
        this();
        this.node = newItemTarget(itemInfo);
    }
}

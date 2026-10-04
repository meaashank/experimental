package com.android.launcher3.logging;

import C4.q;
import android.support.v4.media.d;
import android.support.v4.media.f;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import com.android.launcher3.AppInfo;
import com.android.launcher3.ButtonDropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.userevent.nano.LauncherLogExtensions;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.util.InstantAppResolver;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public class LoggerUtils {
    private static final String UNKNOWN = "UNKNOWN";
    private static final ArrayMap<Class, SparseArray<String>> sNameCache = new ArrayMap<>();

    public static String getActionStr(LauncherLogProto.Action action) {
        int i10 = action.type;
        if (i10 != 0) {
            return i10 != 2 ? getFieldName(i10, LauncherLogProto.Action.Type.class) : getFieldName(action.command, LauncherLogProto.Action.Command.class);
        }
        String fieldName = getFieldName(action.touch, LauncherLogProto.Action.Touch.class);
        int i11 = action.touch;
        if (i11 != 3 && i11 != 4) {
            return fieldName;
        }
        StringBuilder sbA = f.a(fieldName, " direction=");
        sbA.append(getFieldName(action.dir, LauncherLogProto.Action.Direction.class));
        return sbA.toString();
    }

    public static String getFieldName(int i10, Class cls) {
        SparseArray<String> sparseArray;
        ArrayMap<Class, SparseArray<String>> arrayMap = sNameCache;
        synchronized (arrayMap) {
            sparseArray = arrayMap.get(cls);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                for (Field field : cls.getDeclaredFields()) {
                    if (field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers())) {
                        try {
                            field.setAccessible(true);
                            sparseArray.put(field.getInt(null), field.getName());
                        } catch (IllegalAccessException unused) {
                        }
                    }
                }
                sNameCache.put(cls, sparseArray);
            }
        }
        String str = sparseArray.get(i10);
        return str != null ? str : "UNKNOWN";
    }

    private static String getItemStr(LauncherLogProto.Target target) {
        String fieldName = getFieldName(target.itemType, LauncherLogProto.ItemType.class);
        if (target.packageNameHash != 0) {
            StringBuilder sbA = f.a(fieldName, ", packageHash=");
            sbA.append(target.packageNameHash);
            fieldName = sbA.toString();
        }
        if (target.componentHash != 0) {
            StringBuilder sbA2 = f.a(fieldName, ", componentHash=");
            sbA2.append(target.componentHash);
            fieldName = sbA2.toString();
        }
        if (target.intentHash != 0) {
            StringBuilder sbA3 = f.a(fieldName, ", intentHash=");
            sbA3.append(target.intentHash);
            fieldName = sbA3.toString();
        }
        if ((target.packageNameHash != 0 || target.componentHash != 0 || target.intentHash != 0) && target.itemType != 9) {
            StringBuilder sbA4 = f.a(fieldName, ", predictiveRank=");
            sbA4.append(target.predictedRank);
            sbA4.append(", grid(");
            sbA4.append(target.gridX);
            sbA4.append(",");
            sbA4.append(target.gridY);
            sbA4.append("), span(");
            sbA4.append(target.spanX);
            sbA4.append(",");
            sbA4.append(target.spanY);
            sbA4.append("), pageIdx=");
            sbA4.append(target.pageIndex);
            fieldName = sbA4.toString();
        }
        if (target.itemType != 9) {
            return fieldName;
        }
        StringBuilder sbA5 = f.a(fieldName, ", pageIdx=");
        sbA5.append(target.pageIndex);
        return sbA5.toString();
    }

    public static String getTargetStr(LauncherLogProto.Target target) {
        String itemStr;
        if (target == null) {
            return "";
        }
        int i10 = target.type;
        if (i10 == 1) {
            itemStr = getItemStr(target);
        } else if (i10 == 2) {
            itemStr = getFieldName(target.controlType, LauncherLogProto.ControlType.class);
        } else if (i10 != 3) {
            itemStr = "UNKNOWN TARGET TYPE";
        } else {
            itemStr = getFieldName(target.containerType, LauncherLogProto.ContainerType.class);
            int i11 = target.containerType;
            if (i11 == 1 || i11 == 2) {
                StringBuilder sbA = f.a(itemStr, " id=");
                sbA.append(target.pageIndex);
                itemStr = sbA.toString();
            } else if (i11 == 3) {
                StringBuilder sbA2 = f.a(itemStr, " grid(");
                sbA2.append(target.gridX);
                sbA2.append(",");
                itemStr = d.a(sbA2, target.gridY, ")");
            }
        }
        if (target.tipType == 0) {
            return itemStr;
        }
        StringBuilder sbA3 = f.a(itemStr, q.f17581a);
        sbA3.append(getFieldName(target.tipType, LauncherLogProto.TipType.class));
        return sbA3.toString();
    }

    public static LauncherLogProto.Action newAction(int i10) {
        LauncherLogProto.Action action = new LauncherLogProto.Action();
        action.type = i10;
        return action;
    }

    public static LauncherLogProto.Action newCommandAction(int i10) {
        LauncherLogProto.Action actionNewAction = newAction(2);
        actionNewAction.command = i10;
        return actionNewAction;
    }

    public static LauncherLogProto.Target newContainerTarget(int i10) {
        LauncherLogProto.Target targetNewTarget = newTarget(3);
        targetNewTarget.containerType = i10;
        return targetNewTarget;
    }

    public static LauncherLogProto.Target newControlTarget(int i10) {
        LauncherLogProto.Target targetNewTarget = newTarget(2);
        targetNewTarget.controlType = i10;
        return targetNewTarget;
    }

    public static LauncherLogProto.Target newDropTarget(View view) {
        return !(view instanceof ButtonDropTarget) ? newTarget(3) : view != null ? ((ButtonDropTarget) view).getDropTargetForLogging() : newTarget(2);
    }

    public static LauncherLogProto.Target newItemTarget(int i10) {
        LauncherLogProto.Target targetNewTarget = newTarget(1);
        targetNewTarget.itemType = i10;
        return targetNewTarget;
    }

    public static LauncherLogProto.LauncherEvent newLauncherEvent(LauncherLogProto.Action action, LauncherLogProto.Target... targetArr) {
        LauncherLogProto.LauncherEvent launcherEvent = new LauncherLogProto.LauncherEvent();
        launcherEvent.srcTarget = targetArr;
        launcherEvent.action = action;
        return launcherEvent;
    }

    public static LauncherLogProto.Target newTarget(int i10, LauncherLogExtensions.TargetExtension targetExtension) {
        LauncherLogProto.Target target = new LauncherLogProto.Target();
        target.type = i10;
        target.extension = targetExtension;
        return target;
    }

    public static LauncherLogProto.Action newTouchAction(int i10) {
        LauncherLogProto.Action actionNewAction = newAction(0);
        actionNewAction.touch = i10;
        return actionNewAction;
    }

    public static LauncherLogProto.Target newItemTarget(View view, InstantAppResolver instantAppResolver) {
        if (view.getTag() instanceof ItemInfo) {
            return newItemTarget((ItemInfo) view.getTag(), instantAppResolver);
        }
        return newTarget(1);
    }

    public static LauncherLogProto.Target newTarget(int i10) {
        LauncherLogProto.Target target = new LauncherLogProto.Target();
        target.type = i10;
        return target;
    }

    public static LauncherLogProto.Target newItemTarget(ItemInfo itemInfo, InstantAppResolver instantAppResolver) {
        LauncherLogProto.Target targetNewTarget = newTarget(1);
        int i10 = itemInfo.itemType;
        if (i10 == 0) {
            if (instantAppResolver != null && (itemInfo instanceof AppInfo)) {
            }
            targetNewTarget.itemType = 1;
            targetNewTarget.predictedRank = -100;
            return targetNewTarget;
        }
        if (i10 == 1) {
            targetNewTarget.itemType = 2;
            return targetNewTarget;
        }
        if (i10 == 2) {
            targetNewTarget.itemType = 4;
            return targetNewTarget;
        }
        if (i10 == 4) {
            targetNewTarget.itemType = 3;
            return targetNewTarget;
        }
        if (i10 != 6) {
            return targetNewTarget;
        }
        targetNewTarget.itemType = 5;
        return targetNewTarget;
    }
}

package com.prism.commons.utils;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class C {
    public static void a(Bundle bundle, Intent intent) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                intent.putExtra(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                intent.putExtra(str, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                intent.putExtra(str, ((Short) obj).shortValue());
            } else if (obj instanceof Float) {
                intent.putExtra(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                intent.putExtra(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Byte) {
                intent.putExtra(str, ((Byte) obj).byteValue());
            } else if (obj instanceof Character) {
                intent.putExtra(str, ((Character) obj).charValue());
            }
        }
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                bundle2.putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                bundle2.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle2.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle2.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                bundle2.putShort(str, ((Short) obj).shortValue());
            } else if (obj instanceof Float) {
                bundle2.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                bundle2.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Byte) {
                bundle2.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle2.putChar(str, ((Character) obj).charValue());
            }
        }
    }
}

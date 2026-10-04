package com.prism.gaia.download;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import com.prism.gaia.download.j;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class h extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f164684a = null;

    public final void a(Context context, Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        if (a.f164589J) {
            if (action.equals(a.f164599j)) {
                Log.v(a.f164590a, "Receiver open for " + data);
            } else if (action.equals(a.f164600k)) {
                Log.v(a.f164590a, "Receiver list for " + data);
            } else {
                Log.v(a.f164590a, "Receiver hide for " + data);
            }
        }
        Cursor cursorQuery = context.getContentResolver().query(data, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return;
            }
            if (action.equals(a.f164599j)) {
                c(context, cursorQuery);
                b(context, data, cursorQuery);
            } else if (action.equals(a.f164600k)) {
                d(intent, cursorQuery);
            } else {
                b(context, data, cursorQuery);
            }
            cursorQuery.close();
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public final void b(Context context, Uri uri, Cursor cursor) {
        this.f164684a.g(ContentUris.parseId(uri));
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("visibility"));
        if (j.b.c(i10) && i11 == 1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("visibility", (Integer) 0);
            context.getContentResolver().update(uri, contentValues, null, null);
        }
    }

    public final void c(Context context, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow(j.b.f164768t));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(j.b.f164770u));
        Uri uriFromFile = Uri.parse(string);
        if (uriFromFile.getScheme() == null) {
            uriFromFile = Uri.fromFile(new File(string));
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        String strA = b.a(context, string, string2);
        intent.setDataAndType(uriFromFile, strA);
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            Log.d(a.f164590a, "no activity for " + strA, e10);
        }
    }

    public final void d(Intent intent, Cursor cursor) {
        Intent intent2;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("notificationpackage"));
        if (string == null) {
            return;
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("notificationclass"));
        if (cursor.getInt(cursor.getColumnIndex("is_public_api")) != 0) {
            intent2 = new Intent(j.b.f164758o);
            intent2.setPackage(string);
            if (!intent.getBooleanExtra("multiple", false)) {
                intent2.putExtra("extra_click_download_ids", new long[]{cursor.getLong(cursor.getColumnIndexOrThrow("_id"))});
            }
        } else {
            if (string2 == null) {
                return;
            }
            Intent intent3 = new Intent(j.b.f164758o);
            intent3.setClassName(string, string2);
            if (intent.getBooleanExtra("multiple", true)) {
                intent3.setData(j.b.f164748j);
            } else {
                intent3.setData(ContentUris.withAppendedId(j.b.f164748j, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))));
            }
            intent2 = intent3;
        }
        this.f164684a.a(intent2);
    }

    public final void e(Context context) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f164684a == null) {
            this.f164684a = new m(context);
        }
        String action = intent.getAction();
        if (action.equals("android.intent.action.BOOT_COMPLETED")) {
            if (a.f164589J) {
                Log.v(a.f164590a, "Received broadcast intent for android.intent.action.BOOT_COMPLETED");
                return;
            }
            return;
        }
        if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
            if (a.f164589J) {
                Log.v(a.f164590a, "Received broadcast intent for android.intent.action.MEDIA_MOUNTED");
            }
        } else {
            if (action.equals(q4.c.f226807e)) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo != null) {
                    networkInfo.isConnected();
                    return;
                }
                return;
            }
            if (action.equals(a.f164598i)) {
                return;
            }
            if (action.equals(a.f164599j) || action.equals(a.f164600k) || action.equals(a.f164601l)) {
                a(context, intent);
            }
        }
    }
}

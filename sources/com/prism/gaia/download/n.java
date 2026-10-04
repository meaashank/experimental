package com.prism.gaia.download;

import U6.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.Formatter;
import com.prism.gaia.download.j;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public class n extends Activity implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f164810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue<Intent> f164811b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f164812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f164813d;

    public final void a() {
        this.f164810a = null;
        this.f164812c = null;
        c();
    }

    public final void b(Cursor cursor) {
        String fileSize = Formatter.formatFileSize(this, cursor.getInt(cursor.getColumnIndexOrThrow("total_bytes")));
        int i10 = o.n.f72084L;
        String string = getString(i10);
        boolean z10 = this.f164813d.getExtras().getBoolean(d.f164631R);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 2);
        if (z10) {
            builder.setTitle(o.n.f72131S4).setMessage(getString(o.n.f72125R4, fileSize, string)).setPositiveButton(i10, this).setNegativeButton(o.n.f72078K, this);
        } else {
            builder.setTitle(o.n.f72119Q4).setMessage(getString(o.n.f72113P4, fileSize, string)).setPositiveButton(o.n.f72090M, this).setNegativeButton(i10, this);
        }
        this.f164810a = builder.setOnCancelListener(this).show();
    }

    public final void c() {
        if (this.f164810a != null) {
            return;
        }
        if (this.f164811b.isEmpty()) {
            finish();
            return;
        }
        Intent intentPoll = this.f164811b.poll();
        this.f164813d = intentPoll;
        this.f164812c = intentPoll.getData();
        Cursor cursorQuery = getContentResolver().query(this.f164812c, null, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                b(cursorQuery);
                return;
            }
            String str = a.f164590a;
            Objects.toString(this.f164812c);
            a();
        } finally {
            cursorQuery.close();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        boolean z10 = this.f164813d.getExtras().getBoolean(d.f164631R);
        if (z10 && i10 == -2) {
            getContentResolver().delete(this.f164812c, null, null);
        } else if (!z10 && i10 == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(j.b.f164720Q, Boolean.TRUE);
            getContentResolver().update(this.f164812c, contentValues, null, null);
        }
        a();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            this.f164811b.add(intent);
            setIntent(null);
            c();
        }
        Dialog dialog = this.f164810a;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f164810a.show();
    }
}

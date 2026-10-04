package m1;

import Q0.g;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.Nullable;
import e.T;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public class e extends AbstractC5195a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f221085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f221086d;

    public e(@Nullable AbstractC5195a abstractC5195a, Context context, Uri uri) {
        super(abstractC5195a);
        this.f221085c = context;
        this.f221086d = uri;
    }

    public static void w(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // m1.AbstractC5195a
    public boolean a() {
        return b.a(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public boolean b() {
        return b.b(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public AbstractC5195a c(String str) {
        Uri uriX = x(this.f221085c, this.f221086d, "vnd.android.document/directory", str);
        if (uriX != null) {
            return new e(this, this.f221085c, uriX);
        }
        return null;
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public AbstractC5195a d(String str, String str2) {
        Uri uriX = x(this.f221085c, this.f221086d, str, str2);
        if (uriX != null) {
            return new e(this, this.f221085c, uriX);
        }
        return null;
    }

    @Override // m1.AbstractC5195a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f221085c.getContentResolver(), this.f221086d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // m1.AbstractC5195a
    public boolean f() {
        return b.d(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public String k() {
        return b.f(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public String m() {
        return b.h(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public Uri n() {
        return this.f221086d;
    }

    @Override // m1.AbstractC5195a
    public boolean o() {
        return b.i(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public boolean q() {
        return b.j(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public boolean r() {
        return b.k(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public long s() {
        return b.l(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public long t() {
        return b.m(this.f221085c, this.f221086d);
    }

    @Override // m1.AbstractC5195a
    public AbstractC5195a[] u() {
        ContentResolver contentResolver = this.f221085c.getContentResolver();
        Uri uri = this.f221086d;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f221086d, cursorQuery.getString(0)));
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            AbstractC5195a[] abstractC5195aArr = new AbstractC5195a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                abstractC5195aArr[i10] = new e(this, this.f221085c, uriArr[i10]);
            }
            return abstractC5195aArr;
        } finally {
            w(cursorQuery);
        }
    }

    @Override // m1.AbstractC5195a
    public boolean v(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f221085c.getContentResolver(), this.f221086d, str);
            if (uriRenameDocument != null) {
                this.f221086d = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}

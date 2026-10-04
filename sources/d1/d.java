package d1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class d extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int[] f194581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int[] f194582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f194583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f194584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f194585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f194586t;

    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i10);
    }

    @Deprecated
    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i10, cursor);
        this.f194583q = -1;
        this.f194582p = iArr;
        this.f194586t = strArr;
        p(cursor, strArr);
    }

    @Override // d1.AbstractC4294a, d1.b.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.f194584r;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i10 = this.f194583q;
        return i10 > -1 ? cursor.getString(i10) : super.convertToString(cursor);
    }

    @Override // d1.AbstractC4294a
    public void d(View view, Context context, Cursor cursor) {
        b bVar = this.f194585s;
        int[] iArr = this.f194582p;
        int length = iArr.length;
        int[] iArr2 = this.f194581o;
        for (int i10 = 0; i10 < length; i10++) {
            View viewFindViewById = view.findViewById(iArr[i10]);
            if (viewFindViewById != null) {
                if (bVar != null ? bVar.setViewValue(viewFindViewById, cursor, iArr2[i10]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i10]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        x((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                        }
                        w((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // d1.AbstractC4294a
    public Cursor l(Cursor cursor) {
        p(cursor, this.f194586t);
        return super.l(cursor);
    }

    public void o(Cursor cursor, String[] strArr, int[] iArr) {
        this.f194586t = strArr;
        this.f194582p = iArr;
        p(cursor, strArr);
        super.a(cursor);
    }

    public final void p(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f194581o = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f194581o;
        if (iArr == null || iArr.length != length) {
            this.f194581o = new int[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.f194581o[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
        }
    }

    public a q() {
        return this.f194584r;
    }

    public int r() {
        return this.f194583q;
    }

    public b s() {
        return this.f194585s;
    }

    public void t(a aVar) {
        this.f194584r = aVar;
    }

    public void u(int i10) {
        this.f194583q = i10;
    }

    public void v(b bVar) {
        this.f194585s = bVar;
    }

    public void w(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void x(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.f194583q = -1;
        this.f194582p = iArr;
        this.f194586t = strArr;
        p(cursor, strArr);
    }
}

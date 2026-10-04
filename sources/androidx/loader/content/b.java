package androidx.loader.content;

import B0.C0918b;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.C2407f;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Cursor>.a f114413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f114414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f114415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f114416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f114417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f114418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cursor f114419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2407f f114420h;

    public b(@NonNull Context context) {
        super(context);
        this.f114413a = new c.a();
    }

    @Override // androidx.loader.content.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f114419g;
        this.f114419g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Nullable
    public String[] b() {
        return this.f114415c;
    }

    @Nullable
    public String c() {
        return this.f114416d;
    }

    @Override // androidx.loader.content.a
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                C2407f c2407f = this.f114420h;
                if (c2407f != null) {
                    c2407f.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public String[] d() {
        return this.f114417e;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f114414b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f114415c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f114416d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f114417e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f114418f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f114419g);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @Nullable
    public String e() {
        return this.f114418f;
    }

    @NonNull
    public Uri f() {
        return this.f114414b;
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.f114420h = new C2407f();
        }
        try {
            Cursor cursorB = C0918b.b(getContext().getContentResolver(), this.f114414b, this.f114415c, this.f114416d, this.f114417e, this.f114418f, this.f114420h);
            if (cursorB != null) {
                try {
                    cursorB.getCount();
                    cursorB.registerContentObserver(this.f114413a);
                } catch (RuntimeException e10) {
                    cursorB.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f114420h = null;
            }
            return cursorB;
        } catch (Throwable th) {
            synchronized (this) {
                this.f114420h = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void i(@Nullable String[] strArr) {
        this.f114415c = strArr;
    }

    public void j(@Nullable String str) {
        this.f114416d = str;
    }

    public void k(@Nullable String[] strArr) {
        this.f114417e = strArr;
    }

    public void l(@Nullable String str) {
        this.f114418f = str;
    }

    public void m(@NonNull Uri uri) {
        this.f114414b = uri;
    }

    @Override // androidx.loader.content.c
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f114419g;
        if (cursor != null && !cursor.isClosed()) {
            this.f114419g.close();
        }
        this.f114419g = null;
    }

    @Override // androidx.loader.content.c
    public void onStartLoading() {
        Cursor cursor = this.f114419g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f114419g == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.c
    public void onStopLoading() {
        cancelLoad();
    }

    public b(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.f114413a = new c.a();
        this.f114414b = uri;
        this.f114415c = strArr;
        this.f114416d = str;
        this.f114417e = strArr2;
        this.f114418f = str2;
    }
}

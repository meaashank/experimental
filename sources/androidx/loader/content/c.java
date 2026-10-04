package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.v4.media.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.C2430g;
import e.I;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class c<D> {
    Context mContext;
    int mId;
    InterfaceC0304c<D> mListener;
    b<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c.this.onContentChanged();
        }
    }

    public interface b<D> {
        void a(@NonNull c<D> cVar);
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public interface InterfaceC0304c<D> {
        void a(@NonNull c<D> cVar, @Nullable D d10);
    }

    public c(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @I
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @I
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(@Nullable D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        C2430g.a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    @I
    public void deliverCancellation() {
        b<D> bVar = this.mOnLoadCanceledListener;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @I
    public void deliverResult(@Nullable D d10) {
        InterfaceC0304c<D> interfaceC0304c = this.mListener;
        if (interfaceC0304c != null) {
            interfaceC0304c.a(this, d10);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    @I
    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @I
    public void onAbandon() {
    }

    @I
    public boolean onCancelLoad() {
        return false;
    }

    @I
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @I
    public void onForceLoad() {
    }

    @I
    public void onReset() {
    }

    @I
    public void onStartLoading() {
    }

    @I
    public void onStopLoading() {
    }

    @I
    public void registerListener(int i10, @NonNull InterfaceC0304c<D> interfaceC0304c) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC0304c;
        this.mId = i10;
    }

    @I
    public void registerOnLoadCanceledListener(@NonNull b<D> bVar) {
        if (this.mOnLoadCanceledListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = bVar;
    }

    @I
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @I
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @I
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z10 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z10;
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C2430g.a(this, sb2);
        sb2.append(" id=");
        return d.a(sb2, this.mId, "}");
    }

    @I
    public void unregisterListener(@NonNull InterfaceC0304c<D> interfaceC0304c) {
        InterfaceC0304c<D> interfaceC0304c2 = this.mListener;
        if (interfaceC0304c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0304c2 != interfaceC0304c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    @I
    public void unregisterOnLoadCanceledListener(@NonNull b<D> bVar) {
        b<D> bVar2 = this.mOnLoadCanceledListener;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }
}

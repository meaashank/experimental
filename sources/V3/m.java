package v3;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import w3.InterfaceC5744e;

/* JADX INFO: loaded from: classes2.dex */
public final class m<Z> extends AbstractC5679e<Z> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f239816e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Handler f239817f = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.k f239818d;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).a();
            return true;
        }
    }

    public m(com.bumptech.glide.k kVar, int i10, int i11) {
        super(i10, i11);
        this.f239818d = kVar;
    }

    public static <Z> m<Z> b(com.bumptech.glide.k kVar, int i10, int i11) {
        return new m<>(kVar, i10, i11);
    }

    public void a() {
        this.f239818d.y(this);
    }

    @Override // v3.p
    public void g(@NonNull Z z10, @Nullable InterfaceC5744e<? super Z> interfaceC5744e) {
        com.bumptech.glide.request.e eVar = this.f239784c;
        if (eVar == null || !eVar.f()) {
            return;
        }
        f239817f.obtainMessage(1, this).sendToTarget();
    }

    @Override // v3.p
    public void d(@Nullable Drawable drawable) {
    }
}

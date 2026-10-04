package Sa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import g3.C4447e;
import k3.m;
import k3.n;
import k3.q;
import x3.C5785e;

/* JADX INFO: loaded from: classes7.dex */
public class c implements m<ExchangeFile, Object> {
    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull ExchangeFile exchangeFile) {
        return true;
    }

    @Override // k3.m
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Object> a(@NonNull ExchangeFile exchangeFile, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(exchangeFile.getId()), new b(exchangeFile));
    }

    public boolean d(@NonNull ExchangeFile exchangeFile) {
        return true;
    }

    public static class a implements n<ExchangeFile, Object> {
        @Override // k3.n
        @NonNull
        public m<ExchangeFile, Object> e(@NonNull q qVar) {
            return new c();
        }

        @Override // k3.n
        public void d() {
        }
    }
}

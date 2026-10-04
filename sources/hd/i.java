package Hd;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.G;
import okhttp3.internal.http2.ErrorCode;
import okio.InterfaceC5362l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f50886a = a.f50888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final i f50887b = new a.C0050a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f50888a = new a();

        /* JADX INFO: renamed from: Hd.i$a$a, reason: collision with other inner class name */
        public static final class C0050a implements i {
            @Override // Hd.i
            public boolean a(int i10, @NotNull List<Hd.a> requestHeaders) {
                G.p(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // Hd.i
            public boolean b(int i10, @NotNull List<Hd.a> responseHeaders, boolean z10) {
                G.p(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // Hd.i
            public boolean c(int i10, @NotNull InterfaceC5362l source, int i11, boolean z10) throws IOException {
                G.p(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // Hd.i
            public void d(int i10, @NotNull ErrorCode errorCode) {
                G.p(errorCode, "errorCode");
            }
        }
    }

    boolean a(int i10, @NotNull List<Hd.a> list);

    boolean b(int i10, @NotNull List<Hd.a> list, boolean z10);

    boolean c(int i10, @NotNull InterfaceC5362l interfaceC5362l, int i11, boolean z10) throws IOException;

    void d(int i10, @NotNull ErrorCode errorCode);
}

package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.B;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f225806a = a.f225808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final m f225807b = new a.C0859a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f225808a = new a();

        /* JADX INFO: renamed from: okhttp3.m$a$a, reason: collision with other inner class name */
        public static final class C0859a implements m {
            @Override // okhttp3.m
            @NotNull
            public List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException {
                G.p(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    G.o(allByName, "getAllByName(hostname)");
                    return B.dz(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(G.C("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String str) throws UnknownHostException;
}

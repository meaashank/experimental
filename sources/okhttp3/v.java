package okhttp3;

import com.cookiegames.smartcookie.settings.fragment.GeneralSettingsFragment;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import org.jacoco.core.runtime.AgentOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f225857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Proxy f225858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InetSocketAddress f225859c;

    public v(@NotNull a address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        G.p(address, "address");
        G.p(proxy, "proxy");
        G.p(socketAddress, "socketAddress");
        this.f225857a = address;
        this.f225858b = proxy;
        this.f225859c = socketAddress;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = AgentOptions.ADDRESS, imports = {}))
    @dd.j(name = "-deprecated_address")
    @NotNull
    public final a a() {
        return this.f225857a;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = GeneralSettingsFragment.f147946u, imports = {}))
    @dd.j(name = "-deprecated_proxy")
    @NotNull
    public final Proxy b() {
        return this.f225858b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "socketAddress", imports = {}))
    @dd.j(name = "-deprecated_socketAddress")
    @NotNull
    public final InetSocketAddress c() {
        return this.f225859c;
    }

    @dd.j(name = AgentOptions.ADDRESS)
    @NotNull
    public final a d() {
        return this.f225857a;
    }

    @dd.j(name = GeneralSettingsFragment.f147946u)
    @NotNull
    public final Proxy e() {
        return this.f225858b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return G.g(vVar.f225857a, this.f225857a) && G.g(vVar.f225858b, this.f225858b) && G.g(vVar.f225859c, this.f225859c);
    }

    public final boolean f() {
        return this.f225857a.f225308c != null && this.f225858b.type() == Proxy.Type.HTTP;
    }

    @dd.j(name = "socketAddress")
    @NotNull
    public final InetSocketAddress g() {
        return this.f225859c;
    }

    public int hashCode() {
        return this.f225859c.hashCode() + ((this.f225858b.hashCode() + ((this.f225857a.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Route{" + this.f225859c + '}';
    }
}

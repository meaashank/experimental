package Ad;

import Ad.a;
import java.util.List;
import kotlin.jvm.internal.G;
import mozilla.components.concept.fetch.Request;
import org.jetbrains.annotations.NotNull;
import zd.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a.InterfaceC0007a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final zd.b f12242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<a> f12243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Request f12244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12245d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull zd.b client, @NotNull List<? extends a> interceptors, @NotNull Request currentRequest) {
        G.p(client, "client");
        G.p(interceptors, "interceptors");
        G.p(currentRequest, "currentRequest");
        this.f12242a = client;
        this.f12243b = interceptors;
        this.f12244c = currentRequest;
    }

    @Override // Ad.a.InterfaceC0007a
    @NotNull
    public i a(@NotNull Request request) {
        G.p(request, "request");
        this.f12244c = request;
        if (this.f12245d >= this.f12243b.size()) {
            return this.f12242a.a(request);
        }
        a aVar = this.f12243b.get(this.f12245d);
        this.f12245d++;
        return aVar.a(this);
    }

    @Override // Ad.a.InterfaceC0007a
    @NotNull
    public Request getRequest() {
        return this.f12244c;
    }
}

package com.tonyodev.fetch2core;

import com.tonyodev.fetch2core.Downloader;
import com.tonyodev.fetch2core.server.FileRequest;
import java.net.InetSocketAddress;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface c extends Downloader<Kb.a, a> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public InetSocketAddress f194480a = new InetSocketAddress(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public FileRequest f194481b = new FileRequest(0, null, 0, 0, null, null, null, 0, 0, false, 1023, null);

        @NotNull
        public final FileRequest a() {
            return this.f194481b;
        }

        @NotNull
        public final InetSocketAddress b() {
            return this.f194480a;
        }

        public final void c(@NotNull FileRequest fileRequest) {
            G.p(fileRequest, "<set-?>");
            this.f194481b = fileRequest;
        }

        public final void d(@NotNull InetSocketAddress inetSocketAddress) {
            G.p(inetSocketAddress, "<set-?>");
            this.f194480a = inetSocketAddress;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.FileServerDownloader.TransporterRequest");
            a aVar = (a) obj;
            return G.g(this.f194480a, aVar.f194480a) && G.g(this.f194481b, aVar.f194481b);
        }

        public int hashCode() {
            return this.f194481b.hashCode() + (this.f194480a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TransporterRequest(inetSocketAddress=" + this.f194480a + ", fileRequest=" + this.f194481b + ")";
        }
    }

    @NotNull
    List<FileResource> z0(@NotNull Downloader.b bVar);
}

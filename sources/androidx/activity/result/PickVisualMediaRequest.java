package androidx.activity.result;

import d.C4283b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PickVisualMediaRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public C4283b.j.f f85045a = C4283b.j.C0709b.f194526a;

    public static final class Builder {

        @NotNull
        private C4283b.j.f mediaType = C4283b.j.C0709b.f194526a;

        @NotNull
        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.b(this.mediaType);
            return pickVisualMediaRequest;
        }

        @NotNull
        public final Builder setMediaType(@NotNull C4283b.j.f mediaType) {
            G.p(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }
    }

    @NotNull
    public final C4283b.j.f a() {
        return this.f85045a;
    }

    public final void b(@NotNull C4283b.j.f fVar) {
        G.p(fVar, "<set-?>");
        this.f85045a = fVar;
    }
}

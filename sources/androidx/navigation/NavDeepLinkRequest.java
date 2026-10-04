package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.C4969v;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class NavDeepLinkRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Uri f115082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f115083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f115084c;

    @kotlin.jvm.internal.V({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class Builder {

        @NotNull
        public static final a Companion = new a();

        @Nullable
        private String action;

        @Nullable
        private String mimeType;

        @Nullable
        private Uri uri;

        public static final class a {
            public a() {
            }

            @dd.o
            @NotNull
            public final Builder a(@NotNull String action) {
                kotlin.jvm.internal.G.p(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder builder = new Builder(null);
                builder.setAction(action);
                return builder;
            }

            @dd.o
            @NotNull
            public final Builder b(@NotNull String mimeType) {
                kotlin.jvm.internal.G.p(mimeType, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            @dd.o
            @NotNull
            public final Builder c(@NotNull Uri uri) {
                kotlin.jvm.internal.G.p(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ Builder(C4969v c4969v) {
            this();
        }

        @dd.o
        @NotNull
        public static final Builder fromAction(@NotNull String str) {
            return Companion.a(str);
        }

        @dd.o
        @NotNull
        public static final Builder fromMimeType(@NotNull String str) {
            return Companion.b(str);
        }

        @dd.o
        @NotNull
        public static final Builder fromUri(@NotNull Uri uri) {
            return Companion.c(uri);
        }

        @NotNull
        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        @NotNull
        public final Builder setAction(@NotNull String action) {
            kotlin.jvm.internal.G.p(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @NotNull
        public final Builder setMimeType(@NotNull String mimeType) {
            kotlin.jvm.internal.G.p(mimeType, "mimeType");
            if (!new Regex("^[-\\w*.]+/[-\\w+*.]+$").m(mimeType)) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("The given mimeType ", mimeType, " does not match to required \"type/subtype\" format").toString());
            }
            this.mimeType = mimeType;
            return this;
        }

        @NotNull
        public final Builder setUri(@NotNull Uri uri) {
            kotlin.jvm.internal.G.p(uri, "uri");
            this.uri = uri;
            return this;
        }

        private Builder() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@Nullable Uri uri, @Nullable String str, @Nullable String str2) {
        this.f115082a = uri;
        this.f115083b = str;
        this.f115084c = str2;
    }

    @Nullable
    public String a() {
        return this.f115083b;
    }

    @Nullable
    public String b() {
        return this.f115084c;
    }

    @Nullable
    public Uri c() {
        return this.f115082a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@NotNull Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        kotlin.jvm.internal.G.p(intent, "intent");
    }
}

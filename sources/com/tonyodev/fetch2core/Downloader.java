package com.tonyodev.fetch2core;

import Jb.p;
import android.net.Uri;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface Downloader<T, R> extends Closeable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FileDownloaderType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ FileDownloaderType[] $VALUES;
        public static final FileDownloaderType SEQUENTIAL = new FileDownloaderType("SEQUENTIAL", 0);
        public static final FileDownloaderType PARALLEL = new FileDownloaderType("PARALLEL", 1);

        private static final /* synthetic */ FileDownloaderType[] $values() {
            return new FileDownloaderType[]{SEQUENTIAL, PARALLEL};
        }

        static {
            FileDownloaderType[] fileDownloaderTypeArr$values = $values();
            $VALUES = fileDownloaderTypeArr$values;
            $ENTRIES = kotlin.enums.c.c(fileDownloaderTypeArr$values);
        }

        private FileDownloaderType(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<FileDownloaderType> getEntries() {
            return $ENTRIES;
        }

        public static FileDownloaderType valueOf(String str) {
            return (FileDownloaderType) Enum.valueOf(FileDownloaderType.class, str);
        }

        public static FileDownloaderType[] values() {
            return (FileDownloaderType[]) $VALUES.clone();
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f194442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f194443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f194444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final InputStream f194445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final b f194446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f194447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Map<String, List<String>> f194448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f194449h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f194450i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, boolean z10, long j10, @Nullable InputStream inputStream, @NotNull b request, @NotNull String hash, @NotNull Map<String, ? extends List<String>> responseHeaders, boolean z11, @Nullable String str) {
            G.p(request, "request");
            G.p(hash, "hash");
            G.p(responseHeaders, "responseHeaders");
            this.f194442a = i10;
            this.f194443b = z10;
            this.f194444c = j10;
            this.f194445d = inputStream;
            this.f194446e = request;
            this.f194447f = hash;
            this.f194448g = responseHeaders;
            this.f194449h = z11;
            this.f194450i = str;
        }

        public final boolean a() {
            return this.f194449h;
        }

        @Nullable
        public final InputStream b() {
            return this.f194445d;
        }

        public final int c() {
            return this.f194442a;
        }

        public final long d() {
            return this.f194444c;
        }

        @Nullable
        public final String e() {
            return this.f194450i;
        }

        @NotNull
        public final String f() {
            return this.f194447f;
        }

        @NotNull
        public final b g() {
            return this.f194446e;
        }

        @NotNull
        public final Map<String, List<String>> h() {
            return this.f194448g;
        }

        public final boolean i() {
            return this.f194443b;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f194451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f194452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f194453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f194454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Uri f194455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f194456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f194457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final String f194458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Extras f194459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f194460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final String f194461k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f194462l;

        public b(int i10, @NotNull String url, @NotNull Map<String, String> headers, @NotNull String file, @NotNull Uri fileUri, @Nullable String str, long j10, @NotNull String requestMethod, @NotNull Extras extras, boolean z10, @NotNull String redirectUrl, int i11) {
            G.p(url, "url");
            G.p(headers, "headers");
            G.p(file, "file");
            G.p(fileUri, "fileUri");
            G.p(requestMethod, "requestMethod");
            G.p(extras, "extras");
            G.p(redirectUrl, "redirectUrl");
            this.f194451a = i10;
            this.f194452b = url;
            this.f194453c = headers;
            this.f194454d = file;
            this.f194455e = fileUri;
            this.f194456f = str;
            this.f194457g = j10;
            this.f194458h = requestMethod;
            this.f194459i = extras;
            this.f194460j = z10;
            this.f194461k = redirectUrl;
            this.f194462l = i11;
        }

        @NotNull
        public final Extras a() {
            return this.f194459i;
        }

        @NotNull
        public final String b() {
            return this.f194454d;
        }

        @NotNull
        public final Uri c() {
            return this.f194455e;
        }

        @NotNull
        public final Map<String, String> d() {
            return this.f194453c;
        }

        public final int e() {
            return this.f194451a;
        }

        public final long f() {
            return this.f194457g;
        }

        @NotNull
        public final String g() {
            return this.f194461k;
        }

        public final boolean h() {
            return this.f194460j;
        }

        @NotNull
        public final String i() {
            return this.f194458h;
        }

        public final int j() {
            return this.f194462l;
        }

        @Nullable
        public final String k() {
            return this.f194456f;
        }

        @NotNull
        public final String l() {
            return this.f194452b;
        }
    }

    void A1(@NotNull b bVar, @NotNull a aVar);

    @NotNull
    FileDownloaderType B3(@NotNull b bVar, @NotNull Set<? extends FileDownloaderType> set);

    boolean E0(@NotNull b bVar, @NotNull String str);

    void R0(@NotNull a aVar);

    @Nullable
    a U1(@NotNull b bVar, @NotNull p pVar);

    long Z1(@NotNull b bVar);

    boolean a1(@NotNull b bVar);

    @NotNull
    Set<FileDownloaderType> d2(@NotNull b bVar);

    @Nullable
    R o1(T t10, @NotNull b bVar);

    int r1(@NotNull b bVar);

    @Nullable
    Integer x1(@NotNull b bVar, long j10);

    @NotNull
    String z1(@NotNull Map<String, List<String>> map);
}

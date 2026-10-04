package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111465b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111466c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111467d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f111468e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f111469f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f111470g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f111471h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final f f111472a;

    @e.T(31)
    public static final class a {
        @NonNull
        public static Pair<ContentInfo, ContentInfo> a(@NonNull ContentInfo contentInfo, @NonNull final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> pairH = ContentInfoCompat.h(clip, new androidx.core.util.B() { // from class: androidx.core.view.d
                    @Override // androidx.core.util.B
                    public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                        return androidx.core.util.A.a(this, b10);
                    }

                    @Override // androidx.core.util.B
                    public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                        return androidx.core.util.A.c(this, b10);
                    }

                    @Override // androidx.core.util.B
                    public androidx.core.util.B negate() {
                        return new androidx.core.util.z(this);
                    }

                    @Override // androidx.core.util.B
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return pairH.first == null ? Pair.create(null, contentInfo) : pairH.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairH.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairH.second).build());
            }
            boolean zTest = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = zTest ? contentInfo : null;
            if (zTest) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    public interface c {
        void a(@Nullable Uri uri);

        void b(@NonNull ClipData clipData);

        @NonNull
        ContentInfoCompat build();

        void c(int i10);

        void setExtras(@Nullable Bundle bundle);

        void setFlags(int i10);
    }

    @e.T(31)
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ContentInfo f111479a;

        public e(@NonNull ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f111479a = C2443c.a(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public Uri a() {
            return this.f111479a.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @NonNull
        public ContentInfo b() {
            return this.f111479a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @NonNull
        public ClipData d() {
            return this.f111479a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public Bundle getExtras() {
            return this.f111479a.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getFlags() {
            return this.f111479a.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getSource() {
            return this.f111479a.getSource();
        }

        @NonNull
        public String toString() {
            return "ContentInfoCompat{" + this.f111479a + "}";
        }
    }

    public interface f {
        @Nullable
        Uri a();

        @Nullable
        ContentInfo b();

        @NonNull
        ClipData d();

        @Nullable
        Bundle getExtras();

        int getFlags();

        int getSource();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ClipData f111480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f111481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f111482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Uri f111483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Bundle f111484e;

        public g(d dVar) {
            ClipData clipData = dVar.f111474a;
            clipData.getClass();
            this.f111480a = clipData;
            int i10 = dVar.f111475b;
            androidx.core.util.t.g(i10, 0, 5, "source");
            this.f111481b = i10;
            int i11 = dVar.f111476c;
            androidx.core.util.t.k(i11, 1);
            this.f111482c = i11;
            this.f111483d = dVar.f111477d;
            this.f111484e = dVar.f111478e;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public Uri a() {
            return this.f111483d;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public ContentInfo b() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @NonNull
        public ClipData d() {
            return this.f111480a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public Bundle getExtras() {
            return this.f111484e;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getFlags() {
            return this.f111482c;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getSource() {
            return this.f111481b;
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f111480a.getDescription());
            sb2.append(", source=");
            sb2.append(ContentInfoCompat.k(this.f111481b));
            sb2.append(", flags=");
            sb2.append(ContentInfoCompat.b(this.f111482c));
            if (this.f111483d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f111483d.toString().length() + ")";
            }
            sb2.append(str);
            return android.support.v4.media.e.a(sb2, this.f111484e != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    public ContentInfoCompat(@NonNull f fVar) {
        this.f111472a = fVar;
    }

    @NonNull
    public static ClipData a(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipData.addItem(list.get(i10));
        }
        return clipData;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String b(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    @NonNull
    public static Pair<ClipData, ClipData> h(@NonNull ClipData clipData, @NonNull androidx.core.util.B<ClipData.Item> b10) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            ClipData.Item itemAt = clipData.getItemAt(i10);
            if (b10.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @NonNull
    @e.T(31)
    public static Pair<ContentInfo, ContentInfo> i(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @NonNull
    @e.T(31)
    public static ContentInfoCompat m(@NonNull ContentInfo contentInfo) {
        return new ContentInfoCompat(new e(contentInfo));
    }

    @NonNull
    public ClipData c() {
        return this.f111472a.d();
    }

    @Nullable
    public Bundle d() {
        return this.f111472a.getExtras();
    }

    public int e() {
        return this.f111472a.getFlags();
    }

    @Nullable
    public Uri f() {
        return this.f111472a.a();
    }

    public int g() {
        return this.f111472a.getSource();
    }

    @NonNull
    public Pair<ContentInfoCompat, ContentInfoCompat> j(@NonNull androidx.core.util.B<ClipData.Item> b10) {
        ClipData clipDataD = this.f111472a.d();
        if (clipDataD.getItemCount() == 1) {
            boolean zTest = b10.test(clipDataD.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairH = h(clipDataD, b10);
        return pairH.first == null ? Pair.create(null, this) : pairH.second == null ? Pair.create(this, null) : Pair.create(new Builder(this).setClip((ClipData) pairH.first).build(), new Builder(this).setClip((ClipData) pairH.second).build());
    }

    @NonNull
    @e.T(31)
    public ContentInfo l() {
        ContentInfo contentInfoB = this.f111472a.b();
        Objects.requireNonNull(contentInfoB);
        return C2443c.a(contentInfoB);
    }

    @NonNull
    public String toString() {
        return this.f111472a.toString();
    }

    @e.T(31)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ContentInfo.Builder f111473a;

        public b(@NonNull ClipData clipData, int i10) {
            this.f111473a = C2473m.a(clipData, i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void a(@Nullable Uri uri) {
            this.f111473a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void b(@NonNull ClipData clipData) {
            this.f111473a.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new e(this.f111473a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void c(int i10) {
            this.f111473a.setSource(i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setExtras(@Nullable Bundle bundle) {
            this.f111473a.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setFlags(int i10) {
            this.f111473a.setFlags(i10);
        }

        public b(@NonNull ContentInfoCompat contentInfoCompat) {
            C2470l.a();
            this.f111473a = C2467k.a(contentInfoCompat.l());
        }
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public ClipData f111474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f111475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f111476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Uri f111477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Bundle f111478e;

        public d(@NonNull ClipData clipData, int i10) {
            this.f111474a = clipData;
            this.f111475b = i10;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void a(@Nullable Uri uri) {
            this.f111477d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void b(@NonNull ClipData clipData) {
            this.f111474a = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void c(int i10) {
            this.f111475b = i10;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setExtras(@Nullable Bundle bundle) {
            this.f111478e = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setFlags(int i10) {
            this.f111476c = i10;
        }

        public d(@NonNull ContentInfoCompat contentInfoCompat) {
            this.f111474a = contentInfoCompat.f111472a.d();
            this.f111475b = contentInfoCompat.f111472a.getSource();
            this.f111476c = contentInfoCompat.f111472a.getFlags();
            this.f111477d = contentInfoCompat.f111472a.a();
            this.f111478e = contentInfoCompat.f111472a.getExtras();
        }
    }

    public static final class Builder {

        @NonNull
        private final c mBuilderCompat;

        public Builder(@NonNull ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new b(contentInfoCompat);
            } else {
                this.mBuilderCompat = new d(contentInfoCompat);
            }
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData) {
            this.mBuilderCompat.b(clipData);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        @NonNull
        public Builder setFlags(int i10) {
            this.mBuilderCompat.setFlags(i10);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri) {
            this.mBuilderCompat.a(uri);
            return this;
        }

        @NonNull
        public Builder setSource(int i10) {
            this.mBuilderCompat.c(i10);
            return this;
        }

        public Builder(@NonNull ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new b(clipData, i10);
            } else {
                this.mBuilderCompat = new d(clipData, i10);
            }
        }
    }
}

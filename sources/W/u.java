package w;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239994a = "androidx.browser.trusted.displaymode.KEY_ID";

    public static class a implements u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f239995b = 0;

        @Override // w.u
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(u.f239994a, 0);
            return bundle;
        }
    }

    public static class b implements u {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f239996d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f239997e = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f239998f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f239999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f240000c;

        public b(boolean z10, int i10) {
            this.f239999b = z10;
            this.f240000c = i10;
        }

        @NonNull
        public static u a(@NonNull Bundle bundle) {
            return new b(bundle.getBoolean(f239997e), bundle.getInt(f239998f));
        }

        public boolean b() {
            return this.f239999b;
        }

        public int c() {
            return this.f240000c;
        }

        @Override // w.u
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(u.f239994a, 1);
            bundle.putBoolean(f239997e, this.f239999b);
            bundle.putInt(f239998f, this.f240000c);
            return bundle;
        }
    }

    @NonNull
    Bundle toBundle();
}

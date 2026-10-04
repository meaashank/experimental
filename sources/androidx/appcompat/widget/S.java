package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.C5128d;

/* JADX INFO: loaded from: classes.dex */
public interface S extends SpinnerAdapter {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f86141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f86142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LayoutInflater f86143c;

        public a(@NonNull Context context) {
            this.f86141a = context;
            this.f86142b = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f86143c;
            return layoutInflater != null ? layoutInflater : this.f86142b;
        }

        @Nullable
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f86143c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@Nullable Resources.Theme theme) {
            if (theme == null) {
                this.f86143c = null;
            } else if (theme.equals(this.f86141a.getTheme())) {
                this.f86143c = this.f86142b;
            } else {
                this.f86143c = LayoutInflater.from(new C5128d(this.f86141a, theme));
            }
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}

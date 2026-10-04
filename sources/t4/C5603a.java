package t4;

import B0.C0920d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.cookiegames.smartcookie.p;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C5603a extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f239151d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f239152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<? extends Object> f239153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public u4.e f239154c;

    public C5603a(@NotNull Context mContext, @NotNull List<? extends Object> items) {
        G.p(mContext, "mContext");
        G.p(items, "items");
        this.f239152a = mContext;
        this.f239153b = items;
    }

    @NotNull
    public final u4.e a() {
        u4.e eVar = this.f239154c;
        if (eVar != null) {
            return eVar;
        }
        G.S("userPreferences");
        throw null;
    }

    public final void b(@NotNull u4.e eVar) {
        G.p(eVar, "<set-?>");
        this.f239154c = eVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f239153b.size();
    }

    @Override // android.widget.Adapter
    @NotNull
    public Object getItem(int i10) {
        return this.f239153b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    @Nullable
    public View getView(int i10, @Nullable View view, @NotNull ViewGroup parent) {
        int color;
        G.p(parent, "parent");
        Object systemService = this.f239152a.getSystemService("layout_inflater");
        G.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        Object obj = this.f239153b.get(i10);
        String string = null;
        if (!(obj instanceof com.cookiegames.smartcookie.browser.h)) {
            if (obj instanceof com.cookiegames.smartcookie.browser.g) {
                return layoutInflater.inflate(p.m.f145295u0, parent, false);
            }
            return null;
        }
        View viewInflate = layoutInflater.inflate(p.m.f145144N1, parent, false);
        G.o(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(p.j.f144918u5);
        G.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(p.j.f144471Pc);
        G.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        Object obj2 = this.f239153b.get(i10);
        G.n(obj2, "null cannot be cast to non-null type com.cookiegames.smartcookie.browser.MenuItemClass");
        imageView.setImageResource(((com.cookiegames.smartcookie.browser.h) obj2).f141022c);
        Resources resources = this.f239152a.getResources();
        if (resources != null) {
            Object obj3 = this.f239153b.get(i10);
            G.n(obj3, "null cannot be cast to non-null type com.cookiegames.smartcookie.browser.MenuItemClass");
            string = resources.getString(((com.cookiegames.smartcookie.browser.h) obj3).f141021b);
        }
        textView.setText(string);
        TypedValue typedValue = new TypedValue();
        this.f239152a.getTheme().resolveAttribute(p.d.f141667La, typedValue, true);
        if (typedValue.data == -16777216) {
            Context context = this.f239152a;
            int i11 = p.f.f142555T;
            color = C0920d.getColor(context, i11);
            textView.setTextColor(C0920d.getColor(this.f239152a, i11));
        } else {
            Context context2 = this.f239152a;
            int i12 = p.f.If;
            color = C0920d.getColor(context2, i12);
            textView.setTextColor(C0920d.getColor(this.f239152a, i12));
        }
        imageView.setImageTintList(ColorStateList.valueOf(color));
        return viewInflate;
    }
}

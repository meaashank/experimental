package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.prism.hider.vault.commons.ui.e;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f173646a = -12964906;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f173647b = -1907220;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f173648c = new Object();

    /* JADX INFO: renamed from: com.prism.hider.vault.commons.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0689a {
        CharSequence a(Context context);

        void b(FrameLayout frameLayout);

        String getId();
    }

    public static class b extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<? extends InterfaceC0689a> f173649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f173650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f173651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LayoutInflater f173652g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f173653h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f173654i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Runnable f173655j;

        public b(Context context, List<? extends InterfaceC0689a> list, String[] strArr, String[] strArr2, int i10, Runnable runnable) {
            this.f173652g = LayoutInflater.from(context);
            this.f173649d = list;
            this.f173650e = strArr;
            this.f173651f = strArr2;
            float f10 = context.getResources().getDisplayMetrics().density;
            this.f173653h = f10;
            this.f173654i = (int) (i10 * f10);
            this.f173655j = runnable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f173649d.size();
        }

        public final void i(c cVar, String str) {
            ((ImageView) cVar.itemView.findViewById(e.h.f176268E2)).setVisibility(str.equals(this.f173650e[0]) ? 0 : 4);
            boolean zEquals = str.equals(this.f173651f[0]);
            View viewFindViewById = cVar.itemView.findViewById(e.h.f176295H5);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius(this.f173653h * 18.0f);
            gradientDrawable.setStroke((int) ((zEquals ? 2 : 1) * this.f173653h), zEquals ? a.f173646a : a.f173647b);
            viewFindViewById.setBackground(gradientDrawable);
        }

        public final /* synthetic */ void j(String str, View view) {
            if (str.equals(this.f173651f[0])) {
                return;
            }
            int iF = a.f(this.f173649d, this.f173651f[0]);
            this.f173651f[0] = str;
            Object obj = a.f173648c;
            notifyItemChanged(iF, obj);
            notifyItemChanged(a.f(this.f173649d, str), obj);
            Runnable runnable = this.f173655j;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull c cVar, int i10) {
            InterfaceC0689a interfaceC0689a = this.f173649d.get(i10);
            final String id2 = interfaceC0689a.getId();
            ((TextView) cVar.itemView.findViewById(e.h.f176512h7)).setText(interfaceC0689a.a(cVar.itemView.getContext()));
            FrameLayout frameLayout = (FrameLayout) cVar.itemView.findViewById(e.h.f176319K5);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = this.f173654i;
            frameLayout.setLayoutParams(layoutParams);
            interfaceC0689a.b(frameLayout);
            View viewFindViewById = cVar.itemView.findViewById(e.h.f176295H5);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius(this.f173653h * 18.0f);
            viewFindViewById.setForeground(new RippleDrawable(ColorStateList.valueOf(520093696), null, gradientDrawable));
            i(cVar, id2);
            cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: oa.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f223405a.j(id2, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull c cVar, int i10, @NonNull List<Object> list) {
            if (list.isEmpty()) {
                super.onBindViewHolder(cVar, i10, list);
            } else {
                i(cVar, this.f173649d.get(i10).getId());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            return new c(this.f173652g.inflate(e.k.f176808Y, viewGroup, false));
        }
    }

    public static class c extends RecyclerView.C {
        public c(@NonNull View view) {
            super(view);
        }
    }

    public interface d {
        void a(InterfaceC0689a interfaceC0689a);
    }

    public static /* synthetic */ void a(BottomSheetDialog bottomSheetDialog, int i10, DialogInterface dialogInterface) {
        View viewFindViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = i10;
            viewFindViewById.setLayoutParams(layoutParams);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    public static /* synthetic */ void c(String[] strArr, String[] strArr2, List list, b bVar, Button button, float f10, d dVar, View view) {
        if (strArr[0].equals(strArr2[0])) {
            return;
        }
        int iF = f(list, strArr2[0]);
        strArr2[0] = strArr[0];
        Object obj = f173648c;
        bVar.notifyItemChanged(iF, obj);
        bVar.notifyItemChanged(f(list, strArr2[0]), obj);
        h(button, f10, false);
        if (dVar != null) {
            dVar.a((InterfaceC0689a) list.get(f(list, strArr2[0])));
        }
    }

    public static int f(List<? extends InterfaceC0689a> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getId().equals(str)) {
                return i10;
            }
        }
        return 0;
    }

    public static void g(Context context, CharSequence charSequence, int i10, int i11, final List<? extends InterfaceC0689a> list, String str, final d dVar) {
        final float f10 = context.getResources().getDisplayMetrics().density;
        final String[] strArr = {str};
        final String[] strArr2 = {str};
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setContentView(e.k.f176798T);
        final int i12 = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.8f);
        View viewFindViewById = bottomSheetDialog.findViewById(e.h.f176303I5);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = i12;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        View viewFindViewById2 = bottomSheetDialog.findViewById(e.h.f176311J5);
        if (viewFindViewById2 != null) {
            int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingRight(), viewFindViewById2.getPaddingBottom() + (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0));
        }
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: oa.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                com.prism.hider.vault.commons.ui.a.a(bottomSheetDialog, i12, dialogInterface);
            }
        });
        TextView textView = (TextView) bottomSheetDialog.findViewById(e.h.f176512h7);
        if (textView != null) {
            textView.setText(charSequence);
        }
        final Button button = (Button) bottomSheetDialog.findViewById(e.h.f176258D0);
        RecyclerView recyclerView = (RecyclerView) bottomSheetDialog.findViewById(e.h.f176447a5);
        recyclerView.setLayoutManager(new GridLayoutManager(context, i10));
        final b bVar = new b(context, list, strArr, strArr2, i11, new Runnable() { // from class: oa.b
            @Override // java.lang.Runnable
            public final void run() {
                Button button2 = button;
                float f11 = f10;
                String[] strArr3 = strArr2;
                String[] strArr4 = strArr;
                com.prism.hider.vault.commons.ui.a.h(button2, f11, !strArr3[0].equals(strArr4[0]));
            }
        });
        recyclerView.setAdapter(bVar);
        h(button, f10, !strArr2[0].equals(strArr[0]));
        button.setOnClickListener(new View.OnClickListener() { // from class: oa.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.prism.hider.vault.commons.ui.a.c(strArr2, strArr, list, bVar, button, f10, dVar, view);
            }
        });
        bottomSheetDialog.show();
    }

    public static void h(Button button, float f10, boolean z10) {
        if (button == null) {
            return;
        }
        button.setEnabled(z10);
        button.setTextColor(z10 ? -1 : -1117964);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f11 = f10 * 14.0f;
        gradientDrawable.setCornerRadius(f11);
        gradientDrawable.setColor(z10 ? f173646a : -3683628);
        if (!z10) {
            button.setBackground(gradientDrawable);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadius(f11);
        button.setBackground(new RippleDrawable(ColorStateList.valueOf(1090519039), gradientDrawable, gradientDrawable2));
    }
}

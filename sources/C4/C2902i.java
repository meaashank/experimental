package c4;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.V({"SMAP\nBrowserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowserDialog.kt\ncom/cookiegames/smartcookie/dialog/BrowserDialog\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 AlertDialogExtensions.kt\ncom/cookiegames/smartcookie/extensions/AlertDialogExtensionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,213:1\n36#2:214\n36#2:234\n19#2:244\n19#2:245\n3792#3:215\n4307#3,2:216\n11065#3:220\n11400#3,3:221\n1627#3,6:226\n3792#3:235\n4307#3,2:236\n30#4:218\n30#4:232\n30#4:238\n30#4:240\n30#4:242\n30#4:246\n1#5:219\n1#5:233\n1#5:239\n1#5:241\n1#5:243\n1#5:247\n37#6,2:224\n*S KotlinDebug\n*F\n+ 1 BrowserDialog.kt\ncom/cookiegames/smartcookie/dialog/BrowserDialog\n*L\n49#1:214\n102#1:234\n191#1:244\n192#1:245\n54#1:215\n54#1:216,2\n88#1:220\n88#1:221,3\n89#1:226,6\n107#1:235\n107#1:236,2\n70#1:218\n95#1:232\n123#1:238\n152#1:240\n185#1:242\n207#1:246\n70#1:219\n95#1:233\n123#1:239\n152#1:241\n185#1:243\n207#1:247\n88#1:224,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2902i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2902i f126148a = new C2902i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f126149b = 0;

    public static void d(C2903j c2903j, DialogInterface dialogInterface, int i10) {
        c2903j.e();
    }

    public static void f(C2903j c2903j, DialogInterface dialogInterface, int i10) {
        c2903j.e();
    }

    public static void h(InterfaceC4376a interfaceC4376a, DialogInterface dialogInterface) {
        interfaceC4376a.invoke();
    }

    @dd.o
    public static final void i(@NotNull Context context, @NotNull Dialog dialog) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(dialog, "dialog");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(p.g.f143714t2);
        int iB = C4.b.b(context) - (context.getResources().getDimensionPixelSize(p.g.f143729u2) * 2);
        if (dimensionPixelSize > iB) {
            dimensionPixelSize = iB;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(dimensionPixelSize, -2);
        }
    }

    @dd.o
    public static final void j(@NotNull Activity activity, @e.Z int i10, @NotNull C2903j... items) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(items, "items");
        k(activity, activity.getString(i10), (C2903j[]) Arrays.copyOf(items, items.length));
    }

    @dd.o
    public static final void k(@NotNull final Activity activity, @Nullable String str, @NotNull C2903j... items) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(items, "items");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(activity);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
        kotlin.jvm.internal.G.o(layoutInflaterFrom, "from(...)");
        View viewInflate = layoutInflaterFrom.inflate(p.m.f145291t1, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(p.j.f144646c3);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(p.j.f144616a3);
        ArrayList arrayList = new ArrayList();
        for (C2903j c2903j : items) {
            if (c2903j.f126154d) {
                arrayList.add(c2903j);
            }
        }
        o4.j jVar = new o4.j(arrayList, new ed.l() { // from class: c4.d
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C2902i.l(activity, (C2903j) obj);
            }
        });
        if (str != null && str.length() > 0) {
            textView.setText(str);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(jVar);
        recyclerView.setHasFixedSize(true);
        materialAlertDialogBuilder.setView(viewInflate);
        final AlertDialog alertDialogShow = materialAlertDialogBuilder.show();
        Context context = materialAlertDialogBuilder.getContext();
        kotlin.jvm.internal.G.o(context, "getContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        i(context, alertDialogShow);
        jVar.f223285f = new ed.l() { // from class: c4.e
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C2902i.m(alertDialogShow, (C2903j) obj);
            }
        };
    }

    public static final String l(Activity activity, C2903j RecyclerViewStringAdapter) {
        kotlin.jvm.internal.G.p(RecyclerViewStringAdapter, "$this$RecyclerViewStringAdapter");
        String string = activity.getString(RecyclerViewStringAdapter.f126153c);
        kotlin.jvm.internal.G.o(string, "getString(...)");
        return string;
    }

    public static final L0 m(Dialog dialog, C2903j item) {
        kotlin.jvm.internal.G.p(item, "item");
        item.e();
        dialog.dismiss();
        return L0.f217464a;
    }

    @dd.o
    public static final void o(@NotNull Activity activity, @e.Z int i10, @e.Z int i11, @e.Z int i12, @NotNull ed.l<? super String, L0> textInputListener) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(textInputListener, "textInputListener");
        p(activity, i10, i11, null, i12, textInputListener);
    }

    @dd.o
    public static final void p(@NotNull Activity activity, @e.Z int i10, @e.Z int i11, @Nullable String str, @e.Z int i12, @NotNull final ed.l<? super String, L0> textInputListener) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(textInputListener, "textInputListener");
        View viewInflate = LayoutInflater.from(activity).inflate(p.m.f145255m0, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(p.j.f144601Z2);
        editText.setHint(i11);
        if (str != null) {
            editText.setText(str);
        }
        MaterialAlertDialogBuilder positiveButton = new MaterialAlertDialogBuilder(activity).setTitle(i10).setView(viewInflate).setPositiveButton(i12, new DialogInterface.OnClickListener() { // from class: c4.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                C2902i.q(textInputListener, editText, dialogInterface, i13);
            }
        });
        kotlin.jvm.internal.G.o(positiveButton, "setPositiveButton(...)");
        AlertDialog alertDialogShow = positiveButton.show();
        Context context = positiveButton.getContext();
        kotlin.jvm.internal.G.o(context, "getContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        i(context, alertDialogShow);
    }

    public static final void q(ed.l lVar, EditText editText, DialogInterface dialogInterface, int i10) {
        lVar.invoke(editText.getText().toString());
    }

    public static final void s(C2903j[] c2903jArr, DialogInterface dialogInterface, int i10) {
        c2903jArr[i10].e();
    }

    @dd.o
    public static final void t(@NotNull Activity activity, @e.Z int i10, @e.Z int i11, @Nullable Object[] objArr, @NotNull final C2903j positiveButton, @NotNull final C2903j negativeButton, @NotNull final InterfaceC4376a<L0> onCancel) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(positiveButton, "positiveButton");
        kotlin.jvm.internal.G.p(negativeButton, "negativeButton");
        kotlin.jvm.internal.G.p(onCancel, "onCancel");
        String string = objArr != null ? activity.getString(i11, Arrays.copyOf(objArr, objArr.length)) : activity.getString(i11);
        kotlin.jvm.internal.G.m(string);
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(activity);
        materialAlertDialogBuilder.setTitle(i10);
        materialAlertDialogBuilder.setMessage((CharSequence) string);
        materialAlertDialogBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: c4.a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onCancel.invoke();
            }
        });
        materialAlertDialogBuilder.setPositiveButton(positiveButton.f126153c, new DialogInterface.OnClickListener() { // from class: c4.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                positiveButton.e();
            }
        });
        materialAlertDialogBuilder.setNegativeButton(negativeButton.f126153c, new DialogInterface.OnClickListener() { // from class: c4.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                negativeButton.e();
            }
        });
        AlertDialog alertDialogShow = materialAlertDialogBuilder.show();
        Context context = materialAlertDialogBuilder.getContext();
        kotlin.jvm.internal.G.o(context, "getContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        i(context, alertDialogShow);
    }

    public static /* synthetic */ void u(Activity activity, int i10, int i11, Object[] objArr, C2903j c2903j, C2903j c2903j2, InterfaceC4376a interfaceC4376a, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            objArr = null;
        }
        t(activity, i10, i11, objArr, c2903j, c2903j2, interfaceC4376a);
    }

    public static final void v(InterfaceC4376a interfaceC4376a, DialogInterface dialogInterface) {
        interfaceC4376a.invoke();
    }

    public static final void w(C2903j c2903j, DialogInterface dialogInterface, int i10) {
        c2903j.e();
    }

    public static final void x(C2903j c2903j, DialogInterface dialogInterface, int i10) {
        c2903j.e();
    }

    public static final L0 z(Dialog dialog, C2903j item) {
        kotlin.jvm.internal.G.p(item, "item");
        item.e();
        dialog.dismiss();
        return L0.f217464a;
    }

    public final void n(@Nullable Activity activity, @NotNull ed.p<? super MaterialAlertDialogBuilder, ? super Activity, L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        if (activity != null) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(activity);
            block.invoke(materialAlertDialogBuilder, activity);
            AlertDialog alertDialogShow = materialAlertDialogBuilder.show();
            Context context = materialAlertDialogBuilder.getContext();
            kotlin.jvm.internal.G.o(context, "getContext(...)");
            kotlin.jvm.internal.G.m(alertDialogShow);
            i(context, alertDialogShow);
        }
    }

    public final void r(@NotNull Activity activity, @e.Z int i10, @NotNull final C2903j... items) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(items, "items");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(activity);
        materialAlertDialogBuilder.setTitle(i10);
        ArrayList arrayList = new ArrayList(items.length);
        int i11 = 0;
        for (C2903j c2903j : items) {
            arrayList.add(activity.getString(c2903j.f126153c));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        int length = items.length;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (items[i11].f126154d) {
                break;
            } else {
                i11++;
            }
        }
        materialAlertDialogBuilder.setSingleChoiceItems((CharSequence[]) strArr, i11, new DialogInterface.OnClickListener() { // from class: c4.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                C2902i.s(items, dialogInterface, i12);
            }
        });
        materialAlertDialogBuilder.setPositiveButton((CharSequence) activity.getString(p.s.f145769d0), (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogShow = materialAlertDialogBuilder.show();
        Context context = materialAlertDialogBuilder.getContext();
        kotlin.jvm.internal.G.o(context, "getContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        i(context, alertDialogShow);
    }

    public final void y(@NotNull Context context, @Nullable String str, @NotNull C2903j... items) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(items, "items");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        kotlin.jvm.internal.G.o(layoutInflaterFrom, "from(...)");
        View viewInflate = layoutInflaterFrom.inflate(p.m.f145291t1, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(p.j.f144646c3);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(p.j.f144616a3);
        ArrayList arrayList = new ArrayList();
        for (C2903j c2903j : items) {
            if (c2903j.f126154d) {
                arrayList.add(c2903j);
            }
        }
        o4.h hVar = new o4.h(arrayList);
        if (str != null && str.length() > 0) {
            textView.setText(str);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(hVar);
        recyclerView.setHasFixedSize(true);
        materialAlertDialogBuilder.setView(viewInflate);
        final AlertDialog alertDialogShow = materialAlertDialogBuilder.show();
        Context context2 = materialAlertDialogBuilder.getContext();
        kotlin.jvm.internal.G.o(context2, "getContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        i(context2, alertDialogShow);
        hVar.f223279e = new ed.l() { // from class: c4.f
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C2902i.z(alertDialogShow, (C2903j) obj);
            }
        };
    }
}

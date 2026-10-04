package d4;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import c4.C2902i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.J;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nAlertDialogExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialogExtensions.kt\ncom/cookiegames/smartcookie/extensions/AlertDialogExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1549#2:32\n1620#2,3:33\n1549#2:36\n1620#2,3:37\n37#3,2:40\n1#4:42\n*S KotlinDebug\n*F\n+ 1 AlertDialogExtensions.kt\ncom/cookiegames/smartcookie/extensions/AlertDialogExtensionsKt\n*L\n19#1:32\n19#1:33,3\n20#1:36\n20#1:37,3\n20#1:40,2\n*E\n"})
public final class c {
    @NotNull
    public static final Dialog b(@NotNull AlertDialog.Builder builder) {
        G.p(builder, "<this>");
        AlertDialog alertDialogShow = builder.show();
        Context context = builder.getContext();
        G.o(context, "getContext(...)");
        G.m(alertDialogShow);
        C2902i.i(context, alertDialogShow);
        return alertDialogShow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(@NotNull AlertDialog.Builder builder, @NotNull final List<? extends Pair<? extends T, String>> items, T t10, @NotNull final ed.l<? super T, L0> onClick) {
        G.p(builder, "<this>");
        G.p(items, "items");
        G.p(onClick, "onClick");
        List<? extends Pair<? extends T, String>> list = items;
        ArrayList arrayList = new ArrayList(J.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Pair) it.next()).f217467a);
        }
        int iIndexOf = arrayList.indexOf(t10);
        ArrayList arrayList2 = new ArrayList(J.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).f217468b);
        }
        builder.setSingleChoiceItems((String[]) arrayList2.toArray(new String[0]), iIndexOf, new DialogInterface.OnClickListener() { // from class: d4.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                c.d(onClick, items, dialogInterface, i10);
            }
        });
    }

    public static final void d(ed.l lVar, List list, DialogInterface dialogInterface, int i10) {
        lVar.invoke(((Pair) list.get(i10)).f217467a);
    }
}

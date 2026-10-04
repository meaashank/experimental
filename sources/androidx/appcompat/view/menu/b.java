package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f85548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f85549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f85550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f85551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f85552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.a f85553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f85556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85557j;

    public b(Context context, int i10, int i11) {
        this.f85548a = context;
        this.f85551d = LayoutInflater.from(context);
        this.f85554g = i10;
        this.f85555h = i11;
    }

    public void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f85556i).addView(view, i10);
    }

    public abstract void c(k kVar, p.a aVar);

    @Override // androidx.appcompat.view.menu.o
    public boolean collapseItemActionView(h hVar, k kVar) {
        return false;
    }

    public p.a d(ViewGroup viewGroup) {
        return (p.a) this.f85551d.inflate(this.f85555h, viewGroup, false);
    }

    public boolean e(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean expandItemActionView(h hVar, k kVar) {
        return false;
    }

    public o.a f() {
        return this.f85553f;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean flagActionItems() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View g(k kVar, View view, ViewGroup viewGroup) {
        p.a aVarD = view instanceof p.a ? (p.a) view : d(viewGroup);
        c(kVar, aVarD);
        return (View) aVarD;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getId() {
        return this.f85557j;
    }

    @Override // androidx.appcompat.view.menu.o
    public p getMenuView(ViewGroup viewGroup) {
        if (this.f85556i == null) {
            p pVar = (p) this.f85551d.inflate(this.f85554g, viewGroup, false);
            this.f85556i = pVar;
            pVar.initialize(this.f85550c);
            updateMenuView(true);
        }
        return this.f85556i;
    }

    public void h(int i10) {
        this.f85557j = i10;
    }

    public boolean i(int i10, k kVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public void initForMenu(Context context, h hVar) {
        this.f85549b = context;
        this.f85552e = LayoutInflater.from(context);
        this.f85550c = hVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void onCloseMenu(h hVar, boolean z10) {
        o.a aVar = this.f85553f;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.o
    public boolean onSubMenuSelected(t tVar) {
        o.a aVar = this.f85553f;
        h hVar = tVar;
        if (aVar == null) {
            return false;
        }
        if (tVar == null) {
            hVar = this.f85550c;
        }
        return aVar.a(hVar);
    }

    @Override // androidx.appcompat.view.menu.o
    public void setCallback(o.a aVar) {
        this.f85553f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.o
    public void updateMenuView(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f85556i;
        if (viewGroup == null) {
            return;
        }
        h hVar = this.f85550c;
        int i10 = 0;
        if (hVar != null) {
            hVar.flagActionItems();
            ArrayList<k> visibleItems = this.f85550c.getVisibleItems();
            int size = visibleItems.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                k kVar = visibleItems.get(i12);
                if (i(i11, kVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    k itemData = childAt instanceof p.a ? ((p.a) childAt).getItemData() : null;
                    View viewG = g(kVar, childAt, viewGroup);
                    if (kVar != itemData) {
                        viewG.setPressed(false);
                        viewG.jumpDrawablesToCurrentState();
                    }
                    if (viewG != childAt) {
                        b(viewG, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!e(viewGroup, i10)) {
                i10++;
            }
        }
    }
}

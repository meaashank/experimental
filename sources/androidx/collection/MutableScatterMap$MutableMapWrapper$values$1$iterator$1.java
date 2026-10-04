package androidx.collection;

import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.sequences.C5004q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1<V> implements Iterator<V>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Iterator<Integer> f86773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86774b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap<K, V> f86775c;

    public MutableScatterMap$MutableMapWrapper$values$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f86775c = mutableScatterMap;
        this.f86773a = C5004q.a(new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86773a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        int iIntValue = this.f86773a.next().intValue();
        this.f86774b = iIntValue;
        return (V) this.f86775c.f86839c[iIntValue];
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f86774b;
        if (i10 >= 0) {
            this.f86775c.o0(i10);
            this.f86774b = -1;
        }
    }
}

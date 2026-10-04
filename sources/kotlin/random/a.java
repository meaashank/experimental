package kotlin.random;

import kotlin.C;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public abstract class a extends Random {
    @Override // kotlin.random.Random
    public int e(int i10) {
        return d.j(v().nextInt(), i10);
    }

    @Override // kotlin.random.Random
    public boolean g() {
        return v().nextBoolean();
    }

    @Override // kotlin.random.Random
    @C
    @NotNull
    public byte[] i(@NotNull byte[] array) {
        G.p(array, "array");
        v().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.Random
    public double l() {
        return v().nextDouble();
    }

    @Override // kotlin.random.Random
    public float o() {
        return v().nextFloat();
    }

    @Override // kotlin.random.Random
    public int p() {
        return v().nextInt();
    }

    @Override // kotlin.random.Random
    public int q(int i10) {
        return v().nextInt(i10);
    }

    @Override // kotlin.random.Random
    public long s() {
        return v().nextLong();
    }

    @NotNull
    public abstract java.util.Random v();
}

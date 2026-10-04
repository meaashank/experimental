package com.google.common.base;

import U6.j;
import android.support.v4.media.session.f;
import com.google.android.gms.auth.b;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    @VisibleForTesting
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;

        @CheckForNull
        volatile transient T value;

        public ExpiringMemoizingSupplier(Supplier<T> supplier, long j10, TimeUnit timeUnit) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
            this.durationNanos = timeUnit.toNanos(j10);
            Preconditions.checkArgument(j10 > 0, "duration (%s %s) must be > 0", j10, timeUnit);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            long j10 = this.expirationNanos;
            long jSystemNanoTime = Platform.systemNanoTime();
            if (j10 == 0 || jSystemNanoTime - j10 >= 0) {
                synchronized (this) {
                    try {
                        if (j10 == this.expirationNanos) {
                            T t10 = this.delegate.get();
                            this.value = t10;
                            long j11 = jSystemNanoTime + this.durationNanos;
                            if (j11 == 0) {
                                j11 = 1;
                            }
                            this.expirationNanos = j11;
                            return t10;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            long j10 = this.durationNanos;
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 62);
            sb2.append("Suppliers.memoizeWithExpiration(");
            sb2.append(strValueOf);
            sb2.append(j.f68738d);
            return f.a(sb2, j10, ", NANOS)");
        }
    }

    @VisibleForTesting
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        volatile transient boolean initialized;

        @CheckForNull
        transient T value;

        public MemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    try {
                        if (!this.initialized) {
                            T t10 = this.delegate.get();
                            this.value = t10;
                            this.initialized = true;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object objA;
            if (this.initialized) {
                String strValueOf = String.valueOf(this.value);
                objA = b.a(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
            } else {
                objA = this.delegate;
            }
            String strValueOf2 = String.valueOf(objA);
            return b.a(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
        }
    }

    @VisibleForTesting
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        @CheckForNull
        volatile Supplier<T> delegate;
        volatile boolean initialized;

        @CheckForNull
        T value;

        public NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    try {
                        if (!this.initialized) {
                            Supplier<T> supplier = this.delegate;
                            java.util.Objects.requireNonNull(supplier);
                            T t10 = supplier.get();
                            this.value = t10;
                            this.initialized = true;
                            this.delegate = null;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object objA = this.delegate;
            if (objA == null) {
                String strValueOf = String.valueOf(this.value);
                objA = b.a(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
            }
            String strValueOf2 = String.valueOf(objA);
            return b.a(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
        }
    }

    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        public SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.function = (Function) Preconditions.checkNotNull(function);
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.function, this.supplier);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.function);
            String strValueOf2 = String.valueOf(this.supplier);
            StringBuilder sbA = com.google.android.gms.auth.a.a(strValueOf2.length() + strValueOf.length() + 21, "Suppliers.compose(", strValueOf, j.f68738d, strValueOf2);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    public enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // com.google.common.base.Function
        @CheckForNull
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final T instance;

        public SupplierOfInstance(@ParametricNullness T t10) {
            this.instance = t10;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.instance);
            return b.a(strValueOf.length() + 22, "Suppliers.ofInstance(", strValueOf, ")");
        }
    }

    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        public ThreadSafeSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            T t10;
            synchronized (this.delegate) {
                t10 = this.delegate.get();
            }
            return t10;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            return b.a(strValueOf.length() + 32, "Suppliers.synchronizedSupplier(", strValueOf, ")");
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        return ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j10, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(supplier, j10, timeUnit);
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t10) {
        return new SupplierOfInstance(t10);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }
}

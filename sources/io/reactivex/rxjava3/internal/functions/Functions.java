package io.reactivex.rxjava3.internal.functions;

import Bc.b;
import Bc.c;
import Bc.e;
import Bc.g;
import Bc.h;
import Bc.i;
import Bc.j;
import Jc.d;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;
import zc.K;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bc.o<Object, Object> f207352a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f207353b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Bc.a f207354c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g<Object> f207355d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g<Throwable> f207356e = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g<Throwable> f207357f = new E();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bc.q f207358g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bc.r<Object> f207359h = new J();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Bc.r<Object> f207360i = new u();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Bc.s<Object> f207361j = new D();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g<Subscription> f207362k = new z();

    public static final class A<T> implements Bc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<? super K<T>> f207363a;

        public A(g<? super K<T>> onNotification) {
            this.f207363a = onNotification;
        }

        @Override // Bc.a
        public void run() throws Throwable {
            this.f207363a.accept(K.f241332b);
        }
    }

    public static final class B<T> implements g<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<? super K<T>> f207364a;

        public B(g<? super K<T>> onNotification) {
            this.f207364a = onNotification;
        }

        @Override // Bc.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable v10) throws Throwable {
            this.f207364a.accept(K.b(v10));
        }
    }

    public static final class C<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<? super K<T>> f207365a;

        public C(g<? super K<T>> onNotification) {
            this.f207365a = onNotification;
        }

        @Override // Bc.g
        public void accept(T v10) throws Throwable {
            this.f207365a.accept(K.c(v10));
        }
    }

    public static final class D implements Bc.s<Object> {
        @Override // Bc.s
        public Object get() {
            return null;
        }
    }

    public static final class E implements g<Throwable> {
        @Override // Bc.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable error) {
            Ic.a.Y(new OnErrorNotImplementedException(error));
        }
    }

    public static final class F<T> implements Bc.o<T, d<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeUnit f207366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final W f207367b;

        public F(TimeUnit unit, W scheduler) {
            this.f207366a = unit;
            this.f207367b = scheduler;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<T> apply(T t10) {
            return new d<>(t10, this.f207367b.d(this.f207366a), this.f207366a);
        }
    }

    public static final class G<K, T> implements b<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.o<? super T, ? extends K> f207368a;

        public G(Bc.o<? super T, ? extends K> keySelector) {
            this.f207368a = keySelector;
        }

        @Override // Bc.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> m10, T t10) throws Throwable {
            m10.put(this.f207368a.apply(t10), t10);
        }
    }

    public static final class H<K, V, T> implements b<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.o<? super T, ? extends V> f207369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends K> f207370b;

        public H(Bc.o<? super T, ? extends V> valueSelector, Bc.o<? super T, ? extends K> keySelector) {
            this.f207369a = valueSelector;
            this.f207370b = keySelector;
        }

        @Override // Bc.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> m10, T t10) throws Throwable {
            m10.put(this.f207370b.apply(t10), this.f207369a.apply(t10));
        }
    }

    public enum HashSetSupplier implements Bc.s<Set<Object>> {
        INSTANCE;

        @Override // Bc.s
        public Set<Object> get() {
            return new HashSet();
        }
    }

    public static final class I<K, V, T> implements b<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.o<? super K, ? extends Collection<? super V>> f207371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends V> f207372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.o<? super T, ? extends K> f207373c;

        public I(Bc.o<? super K, ? extends Collection<? super V>> collectionFactory, Bc.o<? super T, ? extends V> valueSelector, Bc.o<? super T, ? extends K> keySelector) {
            this.f207371a = collectionFactory;
            this.f207372b = valueSelector;
            this.f207373c = keySelector;
        }

        @Override // Bc.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> m10, T t10) throws Throwable {
            K kApply = this.f207373c.apply(t10);
            Collection<? super V> collectionApply = (Collection) m10.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f207371a.apply(kApply);
                m10.put(kApply, collectionApply);
            }
            collectionApply.add(this.f207372b.apply(t10));
        }
    }

    public static final class J implements Bc.r<Object> {
        @Override // Bc.r
        public boolean test(Object o10) {
            return true;
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object o12, Object o22) {
            return ((Comparable) o12).compareTo(o22);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$a, reason: case insensitive filesystem */
    public static final class C4673a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.a f207374a;

        public C4673a(Bc.a action) {
            this.f207374a = action;
        }

        @Override // Bc.g
        public void accept(T t10) throws Throwable {
            this.f207374a.run();
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$b, reason: case insensitive filesystem */
    public static final class C4674b<T1, T2, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<? super T1, ? super T2, ? extends R> f207375a;

        public C4674b(c<? super T1, ? super T2, ? extends R> f10) {
            this.f207375a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] a10) throws Throwable {
            if (a10.length == 2) {
                return this.f207375a.apply(a10[0], a10[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + a10.length);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$c, reason: case insensitive filesystem */
    public static final class C4675c<T1, T2, T3, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<T1, T2, T3, R> f207376a;

        public C4675c(h<T1, T2, T3, R> f10) {
            this.f207376a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            return this.f207376a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$d, reason: case insensitive filesystem */
    public static final class C4676d<T1, T2, T3, T4, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i<T1, T2, T3, T4, R> f207377a;

        public C4676d(i<T1, T2, T3, T4, R> f10) {
            this.f207377a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f207377a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$e, reason: case insensitive filesystem */
    public static final class C4677e<T1, T2, T3, T4, T5, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j<T1, T2, T3, T4, T5, R> f207378a;

        public C4677e(j<T1, T2, T3, T4, T5, R> f10) {
            this.f207378a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f207378a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$f, reason: case insensitive filesystem */
    public static final class C4678f<T1, T2, T3, T4, T5, T6, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.k<T1, T2, T3, T4, T5, T6, R> f207379a;

        public C4678f(Bc.k<T1, T2, T3, T4, T5, T6, R> f10) {
            this.f207379a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f207379a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$g, reason: case insensitive filesystem */
    public static final class C4679g<T1, T2, T3, T4, T5, T6, T7, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.l<T1, T2, T3, T4, T5, T6, T7, R> f207380a;

        public C4679g(Bc.l<T1, T2, T3, T4, T5, T6, T7, R> f10) {
            this.f207380a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f207380a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$h, reason: case insensitive filesystem */
    public static final class C4680h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f207381a;

        public C4680h(Bc.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f10) {
            this.f207381a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f207381a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$i, reason: case insensitive filesystem */
    public static final class C4681i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Bc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f207382a;

        public C4681i(Bc.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f10) {
            this.f207382a = f10;
        }

        @Override // Bc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f207382a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.Functions$j, reason: case insensitive filesystem */
    public static final class C4682j<T> implements Bc.s<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f207383a;

        public C4682j(int capacity) {
            this.f207383a = capacity;
        }

        @Override // Bc.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get() {
            return new ArrayList(this.f207383a);
        }
    }

    public static final class k<T> implements Bc.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f207384a;

        public k(e supplier) {
            this.f207384a = supplier;
        }

        @Override // Bc.r
        public boolean test(T t10) throws Throwable {
            return !this.f207384a.d();
        }
    }

    public static class l implements g<Subscription> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f207385a;

        public l(int bufferSize) {
            this.f207385a = bufferSize;
        }

        @Override // Bc.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Subscription s10) {
            s10.request(this.f207385a);
        }
    }

    public static final class m<T, U> implements Bc.o<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<U> f207386a;

        public m(Class<U> clazz) {
            this.f207386a = clazz;
        }

        @Override // Bc.o
        public U apply(T t10) {
            return this.f207386a.cast(t10);
        }
    }

    public static final class n<T, U> implements Bc.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<U> f207387a;

        public n(Class<U> clazz) {
            this.f207387a = clazz;
        }

        @Override // Bc.r
        public boolean test(T t10) {
            return this.f207387a.isInstance(t10);
        }
    }

    public static final class o implements Bc.a {
        @Override // Bc.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class p implements g<Object> {
        @Override // Bc.g
        public void accept(Object v10) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class q implements Bc.q {
        @Override // Bc.q
        public void accept(long v10) {
        }
    }

    public static final class r implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class s<T> implements Bc.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f207388a;

        public s(T value) {
            this.f207388a = value;
        }

        @Override // Bc.r
        public boolean test(T t10) {
            return Objects.equals(t10, this.f207388a);
        }
    }

    public static final class t implements g<Throwable> {
        public void a(Throwable error) {
            Ic.a.Y(error);
        }

        @Override // Bc.g
        public void accept(Throwable error) throws Throwable {
            Ic.a.Y(error);
        }
    }

    public static final class u implements Bc.r<Object> {
        @Override // Bc.r
        public boolean test(Object o10) {
            return false;
        }
    }

    public static final class v implements Bc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<?> f207389a;

        public v(Future<?> future) {
            this.f207389a = future;
        }

        @Override // Bc.a
        public void run() throws Exception {
            this.f207389a.get();
        }
    }

    public static final class w implements Bc.o<Object, Object> {
        @Override // Bc.o
        public Object apply(Object v10) {
            return v10;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class x<T, U> implements Callable<U>, Bc.s<U>, Bc.o<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f207390a;

        public x(U value) {
            this.f207390a = value;
        }

        @Override // Bc.o
        public U apply(T t10) {
            return this.f207390a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f207390a;
        }

        @Override // Bc.s
        public U get() {
            return this.f207390a;
        }
    }

    public static final class y<T> implements Bc.o<List<T>, List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator<? super T> f207391a;

        public y(Comparator<? super T> comparator) {
            this.f207391a = comparator;
        }

        public List<T> a(List<T> v10) {
            Collections.sort(v10, this.f207391a);
            return v10;
        }

        @Override // Bc.o
        public Object apply(Object v10) throws Throwable {
            List list = (List) v10;
            Collections.sort(list, this.f207391a);
            return list;
        }
    }

    public static final class z implements g<Subscription> {
        @Override // Bc.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Subscription t10) {
            t10.request(Long.MAX_VALUE);
        }
    }

    public Functions() {
        throw new IllegalStateException("No instances!");
    }

    @yc.e
    public static <T1, T2, T3, T4, T5, R> Bc.o<Object[], R> A(@yc.e j<T1, T2, T3, T4, T5, R> f10) {
        return new C4677e(f10);
    }

    @yc.e
    public static <T1, T2, T3, T4, T5, T6, R> Bc.o<Object[], R> B(@yc.e Bc.k<T1, T2, T3, T4, T5, T6, R> f10) {
        return new C4678f(f10);
    }

    @yc.e
    public static <T1, T2, T3, T4, T5, T6, T7, R> Bc.o<Object[], R> C(@yc.e Bc.l<T1, T2, T3, T4, T5, T6, T7, R> f10) {
        return new C4679g(f10);
    }

    @yc.e
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Bc.o<Object[], R> D(@yc.e Bc.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f10) {
        return new C4680h(f10);
    }

    @yc.e
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Bc.o<Object[], R> E(@yc.e Bc.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f10) {
        return new C4681i(f10);
    }

    public static <T, K> b<Map<K, T>, T> F(final Bc.o<? super T, ? extends K> keySelector) {
        return new G(keySelector);
    }

    public static <T, K, V> b<Map<K, V>, T> G(final Bc.o<? super T, ? extends K> keySelector, final Bc.o<? super T, ? extends V> valueSelector) {
        return new H(valueSelector, keySelector);
    }

    public static <T, K, V> b<Map<K, Collection<V>>, T> H(final Bc.o<? super T, ? extends K> keySelector, final Bc.o<? super T, ? extends V> valueSelector, final Bc.o<? super K, ? extends Collection<? super V>> collectionFactory) {
        return new I(collectionFactory, valueSelector, keySelector);
    }

    public static <T> g<T> a(Bc.a action) {
        return new C4673a(action);
    }

    @yc.e
    public static <T> Bc.r<T> b() {
        return (Bc.r<T>) f207360i;
    }

    @yc.e
    public static <T> Bc.r<T> c() {
        return (Bc.r<T>) f207359h;
    }

    public static <T> g<T> d(int bufferSize) {
        return new l(bufferSize);
    }

    @yc.e
    public static <T, U> Bc.o<T, U> e(@yc.e Class<U> target) {
        return new m(target);
    }

    public static <T> Bc.s<List<T>> f(int capacity) {
        return new C4682j(capacity);
    }

    public static <T> Bc.s<Set<T>> g() {
        return HashSetSupplier.INSTANCE;
    }

    public static <T> g<T> h() {
        return (g<T>) f207355d;
    }

    public static <T> Bc.r<T> i(T value) {
        return new s(value);
    }

    @yc.e
    public static Bc.a j(@yc.e Future<?> future) {
        return new v(future);
    }

    @yc.e
    public static <T> Bc.o<T, T> k() {
        return (Bc.o<T, T>) f207352a;
    }

    public static <T, U> Bc.r<T> l(Class<U> clazz) {
        return new n(clazz);
    }

    @yc.e
    public static <T> Callable<T> m(@yc.e T value) {
        return new x(value);
    }

    @yc.e
    public static <T, U> Bc.o<T, U> n(@yc.e U value) {
        return new x(value);
    }

    @yc.e
    public static <T> Bc.s<T> o(@yc.e T value) {
        return new x(value);
    }

    public static <T> Bc.o<List<T>, List<T>> p(final Comparator<? super T> comparator) {
        return new y(comparator);
    }

    public static <T> Comparator<T> q() {
        return NaturalComparator.INSTANCE;
    }

    public static <T> Bc.a r(g<? super K<T>> onNotification) {
        return new A(onNotification);
    }

    public static <T> g<Throwable> s(g<? super K<T>> onNotification) {
        return new B(onNotification);
    }

    public static <T> g<T> t(g<? super K<T>> onNotification) {
        return new C(onNotification);
    }

    @yc.e
    public static <T> Bc.s<T> u() {
        return (Bc.s<T>) f207361j;
    }

    public static <T> Bc.r<T> v(e supplier) {
        return new k(supplier);
    }

    public static <T> Bc.o<T, d<T>> w(TimeUnit unit, W scheduler) {
        return new F(unit, scheduler);
    }

    @yc.e
    public static <T1, T2, R> Bc.o<Object[], R> x(@yc.e c<? super T1, ? super T2, ? extends R> f10) {
        return new C4674b(f10);
    }

    @yc.e
    public static <T1, T2, T3, R> Bc.o<Object[], R> y(@yc.e h<T1, T2, T3, R> f10) {
        return new C4675c(f10);
    }

    @yc.e
    public static <T1, T2, T3, T4, R> Bc.o<Object[], R> z(@yc.e i<T1, T2, T3, T4, R> f10) {
        return new C4676d(f10);
    }
}

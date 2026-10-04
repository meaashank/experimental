package io.reactivex.rxjava3.internal.queue;

import Dc.p;
import java.util.concurrent.atomic.AtomicReference;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class MpscLinkedQueue<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f211703a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f211704b = new AtomicReference<>();

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public E f211705a;

        public LinkedQueueNode() {
        }

        public E d() {
            E e10 = this.f211705a;
            this.f211705a = null;
            return e10;
        }

        public E g() {
            return this.f211705a;
        }

        public LinkedQueueNode<E> h() {
            return get();
        }

        public void i(LinkedQueueNode<E> n10) {
            lazySet(n10);
        }

        public void j(E newValue) {
            this.f211705a = newValue;
        }

        public LinkedQueueNode(E val) {
            this.f211705a = val;
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        d(linkedQueueNode);
        e(linkedQueueNode);
    }

    public LinkedQueueNode<T> a() {
        return this.f211704b.get();
    }

    public LinkedQueueNode<T> b() {
        return this.f211704b.get();
    }

    public LinkedQueueNode<T> c() {
        return this.f211703a.get();
    }

    @Override // Dc.q
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public void d(LinkedQueueNode<T> node) {
        this.f211704b.lazySet(node);
    }

    public LinkedQueueNode<T> e(LinkedQueueNode<T> node) {
        return this.f211703a.getAndSet(node);
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // Dc.q
    public boolean offer(final T e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(e10);
        e(linkedQueueNode).lazySet(linkedQueueNode);
        return true;
    }

    @Override // Dc.p, Dc.q
    @f
    public T poll() {
        LinkedQueueNode<T> linkedQueueNode;
        LinkedQueueNode<T> linkedQueueNodeA = a();
        LinkedQueueNode<T> linkedQueueNode2 = (LinkedQueueNode) linkedQueueNodeA.get();
        if (linkedQueueNode2 != null) {
            T t10 = linkedQueueNode2.f211705a;
            linkedQueueNode2.f211705a = null;
            d(linkedQueueNode2);
            return t10;
        }
        if (linkedQueueNodeA == c()) {
            return null;
        }
        do {
            linkedQueueNode = (LinkedQueueNode) linkedQueueNodeA.get();
        } while (linkedQueueNode == null);
        T t11 = linkedQueueNode.f211705a;
        linkedQueueNode.f211705a = null;
        d(linkedQueueNode);
        return t11;
    }

    @Override // Dc.q
    public boolean offer(T v12, T v22) {
        offer(v12);
        offer(v22);
        return true;
    }
}

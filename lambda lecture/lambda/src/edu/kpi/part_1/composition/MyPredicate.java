package edu.kpi.part_1.composition;

/**
 * Created by olenasyrota on 11/2/15.
 */
@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);

    default MyPredicate<T> and(MyPredicate<? super T> p) {
        return (t) -> this.test(t) && p.test(t);
    }

    default MyPredicate<T> negate(){
        return t -> !this.test(t);
    }

    default MyPredicate<T> or(MyPredicate<? super T> p) {
        return t -> this.test(t) || p.test(t);
    }

    default MyPredicate<T> xor(MyPredicate<? super T> p) {
        return t -> this.test(t) ^ p.test(t);
    }
}


import { computed, effect, Injectable, Signal, signal } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CounterService {

  private count = signal(0)

  doubleCount: Signal<number> = computed(() => this.count() * 2);

  constructor(){
    effect(() => {
      console.log("Count: ", this.count()," ", "Double Count: ", this.doubleCount());
      
    })
  }

  getCounter(){
    return this.count()
  }

  incrementCounter(){
    // this.count.set(this.count() + 1);
    this.count.update((oldValue) => {
      return oldValue + 1;
    })
    // this.count = this.count + 1;
  }
}

import { DECREMENT, INCREMENET } from "./actionTypes";

const intialState = {
    value: 0
}

const counterReducer = (state=intialState, action) => {
    switch (action.type) {
        case INCREMENET:
            return {
                ...state,
                value: state.value + 1
            }
        case DECREMENT:
                return {
                    ...state,
                    value: state.value > 0 ? state.value - 1 : 0
                }
        default:
            return state;
    }
}

export default counterReducer;
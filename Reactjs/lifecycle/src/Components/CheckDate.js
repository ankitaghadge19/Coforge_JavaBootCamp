import React from 'react';

class CheckDate extends React.Component {
  constructor(props) {
    super(props);
    this.state = { date: new Date() };
  }

  componentDidMount() {
    // Called once, after the component is added to the DOM
    console.log('ComponentDidMount: Component has been mounted');
    this.timerID = setInterval(() => this.tick(), 1000);
  }

  componentDidUpdate(prevProps, prevState) {
    // Called immediately after updating occurs
    console.log('ComponentDidUpdate: Component has been updated');
    console.log('Previous state:', prevState);
    console.log('Current state:', this.state);
  }

  componentWillUnmount() {
    // Called right before the component is removed from the DOM
    console.log('ComponentWillUnmount: Cleaning up before component is removed');
    clearInterval(this.timerID);
  }

  tick() {
    // Updates the state with the current date and time
    this.setState({
      date: new Date()
    });
  }

  render() {
    return (
      <div>
        <h2>The current date and time is: {this.state.date.toString()}</h2>
      </div>
    );
  }
}

export default CheckDate;

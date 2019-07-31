import React, { Component } from 'react'
import Reim from '../../models/reim';

interface IState {
    reims: Reim[]
}

export default class Reims extends Component<{}, IState> {
    constructor(props: any) {
        super(props);
        this.state = {
            reims: []
        };
    }

    async componentDidMount() {
        const resp = await fetch('http://localhost:8012/reims', {
            credentials: 'include'
        });
        const reimsFromServer = await resp.json();
        this.setState({
            reims: reimsFromServer
        });
        console.log(reimsFromServer);
    }

    render() {
        const reims = this.state.reims;
        return (
            <div id="reim-table-container">
                <table className="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Author</th>
                            <th scope="col">Amount</th>
                            <th scope="col">Date Submited</th>
                            <th scope="col">Date Resolved</th>
                            <th scope="col">Description</th>
                            <th scope="col">Resolver</th>
                            <th scope="col">Status</th>
                            <th scope="col">Type</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            reims.map(reim =>
                                <tr key={'reimId-' + reim.reimId}>
                                    <td>${reim.reimId}</td>
                                    <td>${reim.author}</td>
                                    <td>${reim.amount}</td>
                                    <td>${reim.dateSubmitted}</td>
                                    <td>${reim.dateResolved}</td>
                                    <td>${reim.description}</td>
                                    <td>${reim.resolver}</td>
                                    <td>${reim.status}</td>
                                    <td>${reim.type}</td>
                                </tr>)
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

import React from 'react';

type Props = {
    message: string;
}

const Hello = ({ message }: Props) => (
    <h1>{ message }</h1>
);

export default Hello;



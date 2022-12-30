import React from 'react';

function SampleLayout(props) {
    return (
        <div>
            <h1>Header</h1>
            {props.children}
            <h3>Footer</h3>
        </div>
    );
}

export default SampleLayout;
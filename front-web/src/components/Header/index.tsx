import { ReactComponent } from '*.svg';
import React from 'react';
import { ReactComponent as Logo } from '../../assets/logo.svg';
import './style.css';

const Header = () => (
    <header className="main-header">
        <Logo/>

        <div className="logo-text">
            <span className="logo-text-1">App Pesquisa</span>
            <span className="logo-text-2"> Games</span>
        </div>
    </header>
);

export default Header;


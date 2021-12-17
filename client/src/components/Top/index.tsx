import React from "react";

import { Container } from "./styles";

import { FaDiscord } from "react-icons/fa";

import logo from '../../assets/wetubebot.png';

const Navbar: React.FC = () => {
    return (
        <Container>
            <nav>
                <img src={logo} alt="Costs" width="65px" />
                <h3>WeTubeBot</h3>
            </nav>
            <main>
                <h1>O bot de música mais <span style={{color: "yellow"}}>estranho</span> que você verá hoje</h1>
                <p>O WeTubeBot foi feito em java, usando um Wrapper chamado JDA. Conta com comandos básicos como os mais famosos bots de música, além de possuir comandos de memes e piadas bem ruins. No geral, não leve-o muito a sério e aprecie a brincadeira <br /><br /> Caso tenha gostado da proposta, adicione o Bot em seu servidor :)</p>
                <a style={{textDecoration: "none"}} href="https://discord.com/oauth2/authorize?client_id=919248269836714055&permissions=2150648832&scope=bot" target="_blank" rel="noreferrer"><button><FaDiscord /> Adicionar Bot</button></a>
            </main>
        </Container>
    );
};

export default Navbar;
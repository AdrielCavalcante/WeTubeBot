import React from "react";

import { Container, Title, Separator, Description, Our } from "./styles";

import logo from '../../assets/wetubebot.png';

const Navbar: React.FC = () => {
    return (
        <nav>
            <Container>
                <img src={logo} alt="Costs" width="65px" />

                <Title>WeTubeBot</Title>

                <Separator />

                <Description>Tudo <Our>nosso</Our>, me adicione no seu server</Description>

            </Container>
        </nav>
    );
};

export default Navbar;
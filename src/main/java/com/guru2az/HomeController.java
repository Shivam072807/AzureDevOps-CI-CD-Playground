package com.guru2az;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8" />
            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
            <title>Deployment Dashboard | DevOps CI/CD</title>

            <!-- Professional Google Font -->
            <link rel="preconnect" href="https://fonts.googleapis.com">
            <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
            <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">

            <style>
                * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                    font-family: 'Poppins', sans-serif;
                }

                body {
                    min-height: 100vh;
                    background: radial-gradient(circle at top left, #1f2937 0, #020617 45%, #000 100%);
                    color: #e5e7eb;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    padding: 24px;
                }

                .shell {
                    max-width: 1100px;
                    width: 100%;
                }

                .top-bar {
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                    margin-bottom: 32px;
                }

                .brand {
                    display: flex;
                    align-items: center;
                    gap: 10px;
                }

                .brand-logo {
                    width: 32px;
                    height: 32px;
                    border-radius: 12px;
                    background: conic-gradient(from 120deg, #22c55e, #0ea5e9, #6366f1, #22c55e);
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    font-size: 18px;
                    font-weight: 700;
                    color: #020617;
                    box-shadow: 0 0 15px rgba(59, 130, 246, 0.7);
                }

                .brand-name {
                    font-weight: 600;
                    letter-spacing: 0.04em;
                    font-size: 18px;
                }

                .env-pill {
                    padding: 6px 14px;
                    border-radius: 999px;
                    border: 1px solid rgba(148, 163, 184, 0.4);
                    font-size: 12px;
                    text-transform: uppercase;
                    letter-spacing: 0.1em;
                    display: inline-flex;
                    align-items: center;
                    gap: 6px;
                    background: rgba(15, 23, 42, 0.9);
                }

                .status-dot {
                    width: 8px;
                    height: 8px;
                    border-radius: 999px;
                    background: #22c55e;
                    box-shadow: 0 0 10px rgba(34, 197, 94, 0.9);
                }

                .grid {
                    display: grid;
                    grid-template-columns: minmax(0, 2fr) minmax(0, 1.4fr);
                    gap: 24px;
                }

                /* Main card */
                .card-main {
                    position: relative;
                    padding: 2px;
                    border-radius: 20px;
                    background: linear-gradient(135deg, rgba(59,130,246,0.7), rgba(16,185,129,0.5), rgba(236,72,153,0.5));
                    box-shadow: 0 30px 60px rgba(15, 23, 42, 0.9);
                    overflow: hidden;
                }

                .card-main-inner {
                    background: radial-gradient(circle at top, rgba(15,23,42,1), rgba(15,23,42,0.96));
                    border-radius: 18px;
                    padding: 28px 28px 24px;
                    position: relative;
                    overflow: hidden;
                }

                .badge {
                    display: inline-flex;
                    align-items: center;
                    gap: 8px;
                    padding: 6px 12px;
                    border-radius: 999px;
                    background: rgba(22, 163, 74, 0.15);
                    border: 1px solid rgba(22, 163, 74, 0.5);
                    color: #bbf7d0;
                    font-size: 11px;
                    text-transform: uppercase;
                    letter-spacing: 0.16em;
                    margin-bottom: 14px;
                }

                .badge span.dot {
                    width: 6px;
                    height: 6px;
                    border-radius: 999px;
                    background: #22c55e;
                }

                h1 {
                    font-size: 30px;
                    line-height: 1.2;
                    margin-bottom: 10px;
                    font-weight: 600;
                }

                .sub {
                    font-size: 14px;
                    color: #9ca3af;
                    margin-bottom: 24px;
                    max-width: 460px;
                }

                .tags {
                    display: flex;
                    flex-wrap: wrap;
                    gap: 8px;
                    margin-bottom: 20px;
                }

                .tag {
                    font-size: 11px;
                    padding: 6px 10px;
                    border-radius: 999px;
                    background: rgba(31,41,55,0.9);
                    border: 1px solid rgba(55,65,81,0.9);
                    color: #e5e7eb;
                }

                .glow-strip {
                    height: 1px;
                    width: 100%;
                    background: linear-gradient(90deg, transparent, #38bdf8, #a855f7, transparent);
                    opacity: 0.6;
                    margin-bottom: 16px;
                }

                .metrics {
                    display: flex;
                    gap: 18px;
                    flex-wrap: wrap;
                }

                .metric {
                    flex: 1;
                    min-width: 110px;
                }

                .metric-label {
                    font-size: 11px;
                    text-transform: uppercase;
                    letter-spacing: 0.12em;
                    color: #9ca3af;
                    margin-bottom: 2px;
                }

                .metric-value {
                    font-size: 18px;
                    font-weight: 600;
                    color: #e5e7eb;
                }

                .metric-caption {
                    font-size: 11px;
                    color: #6b7280;
                }

                /* Right side card */
                .card-side {
                    background: radial-gradient(circle at top, #020617, #020617 40%, #020617);
                    border-radius: 18px;
                    border: 1px solid rgba(55, 65, 81, 0.9);
                    padding: 18px 18px 16px;
                    box-shadow: 0 18px 40px rgba(15, 23, 42, 0.9);
                    display: flex;
                    flex-direction: column;
                    justify-content: space-between;
                    gap: 14px;
                }

                .side-header {
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                }

                .side-title {
                    font-size: 13px;
                    font-weight: 500;
                }

                .pill {
                    font-size: 11px;
                    padding: 4px 10px;
                    border-radius: 999px;
                    background: rgba(15,23,42,1);
                    border: 1px solid rgba(55,65,81,1);
                    color: #9ca3af;
                }

                .timeline {
                    margin-top: 4px;
                    font-size: 11px;
                    color: #9ca3af;
                }

                .steps {
                    margin-top: 8px;
                    border-radius: 12px;
                    background: rgba(15,23,42,0.9);
                    border: 1px solid rgba(31,41,55,1);
                    padding: 10px 12px;
                }

                .step {
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                    padding: 6px 0;
                    font-size: 11px;
                    color: #e5e7eb;
                }

                .step + .step {
                    border-top: 1px dashed rgba(55,65,81,0.8);
                }

                .step-name {
                    display: flex;
                    align-items: center;
                    gap: 8px;
                }

                .step-dot {
                    width: 9px;
                    height: 9px;
                    border-radius: 999px;
                    border: 2px solid #22c55e;
                    box-shadow: 0 0 8px rgba(34,197,94,0.8);
                }

                .step-dot.pending {
                    border-color: #f97316;
                    box-shadow: 0 0 5px rgba(249,115,22,0.9);
                }

                .step-status {
                    font-size: 11px;
                    color: #6b7280;
                }

                .footer-note {
                    margin-top: 4px;
                    font-size: 10px;
                    color: #6b7280;
                    text-align: right;
                }

                @media (max-width: 860px) {
                    .grid {
                        grid-template-columns: minmax(0, 1fr);
                    }
                }
            </style>
        </head>
        <body>
            <div class="shell">
                <div class="top-bar">
                    <div class="brand">
                        <div class="brand-logo">S</div>
                        <div class="brand-name">Shivam DevOps Cloud</div>
                    </div>
                    <div class="env-pill">
                        <span class="status-dot"></span>
                        <span>PRODUCTION • AZURE</span>
                    </div>
                </div>

                <div class="grid">
                    <!-- Main left card -->
                    <div class="card-main">
                        <div class="card-main-inner">
                            <div class="badge">
                                <span class="dot"></span>
                                LIVE DEPLOYMENT VERIFIED
                            </div>

                            <h1>My DevOps CI/CD project deployed successfully.</h1>
                            <p class="sub">
                                Spring Boot application is running behind an automated Azure DevOps pipeline,
                                delivering reliable, repeatable deployments to Azure App Service.
                            </p>

                            <div class="tags">
                                <span class="tag">Spring Boot • Java 17</span>
                                <span class="tag">Azure DevOps Pipelines</span>
                                <span class="tag">Linux Web App</span>
                                <span class="tag">Maven Build &amp; Test</span>
                            </div>

                            <div class="glow-strip"></div>

                            <div class="metrics">
                                <div class="metric">
                                    <div class="metric-label">Latest Status</div>
                                    <div class="metric-value">✅ Healthy</div>
                                    <div class="metric-caption">Web app reachable &amp; responding</div>
                                </div>
                                <div class="metric">
                                    <div class="metric-label">Release Channel</div>
                                    <div class="metric-value">Production</div>
                                    <div class="metric-caption">CI → CD to Azure App Service</div>
                                </div>
                                <div class="metric">
                                    <div class="metric-label">Owner</div>
                                    <div class="metric-value">Shivam</div>
                                    <div class="metric-caption">Designed &amp; implemented pipeline</div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Right side deployment timeline -->
                    <div class="card-side">
                        <div>
                            <div class="side-header">
                                <div class="side-title">Latest Pipeline Run</div>
                                <div class="pill">CI / CD Workflow</div>
                            </div>
                            <div class="timeline">Code → Build → Test → Package → Deploy → Verify</div>

                            <div class="steps">
                                <div class="step">
                                    <div class="step-name">
                                        <span class="step-dot"></span>
                                        <span>Build &amp; Unit Tests</span>
                                    </div>
                                    <div class="step-status">Maven • JUnit</div>
                                </div>
                                <div class="step">
                                    <div class="step-name">
                                        <span class="step-dot"></span>
                                        <span>Artifact Published</span>
                                    </div>
                                    <div class="step-status">drop/*.jar</div>
                                </div>
                                <div class="step">
                                    <div class="step-name">
                                        <span class="step-dot"></span>
                                        <span>Azure Web App Deploy</span>
                                    </div>
                                    <div class="step-status">my-ci-cd-webapp</div>
                                </div>
                                <div class="step">
                                    <div class="step-name">
                                        <span class="step-dot"></span>
                                        <span>Smoke Check</span>
                                    </div>
                                    <div class="step-status">GET / • 200 OK</div>
                                </div>
                            </div>
                        </div>

                        <div class="footer-note">
                            CI/CD pipeline demo • Shivam Rajeshirke • Azure DevOps × Spring Boot
                        </div>
                    </div>
                </div>
            </div>
        </body>
        </html>
        """;
    }
}
